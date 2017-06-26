/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import db.DBBroker;
import db.ParametriBaze;
import domen.Pesma;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import niti.NitPesma;
import so.OpstaSO;
import so.SODodajPesmu;
import so.SOVratiSvePesme;

/**
 *
 * @author nevenac
 */
public class Kontroler {

    private static Kontroler instanca;
    private NitPesma nit;
    private JDialog dialog;

    private Kontroler() {
    }

    public static Kontroler getInstance() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }

    public ParametriBaze dajParametre() {
        ParametriBaze pb = new ParametriBaze("MySQL", "root", "", "player", "com.mysql.jdbc.Driver", 3306);
        return pb;
    }

    public boolean sacuvajPesmu(Pesma p) {
        OpstaSO o = new SODodajPesmu();
        try {
            o.izvrsiOperaciju(p);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public List<Pesma> vratiSvePesme() throws Exception {
        OpstaSO o = new SOVratiSvePesme();
        o.izvrsiOperaciju(new Pesma());
        return ((SOVratiSvePesme) o).getP();
    }

    public void pokreniPesmu(Pesma p) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(p.getLokacija());
            System.out.println(p.getLokacija());
            nit = new NitPesma(fis);
            nit.play();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void zaustaviPesmu() {
        nit.stoppesmu();
    }

    public JDialog getDialog() {
        return dialog;
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
    }
    
    public void zatvoriDialog(){
        dialog.setVisible(false);
    }
    
    

}
