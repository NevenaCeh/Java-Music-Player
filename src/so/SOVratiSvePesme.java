/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Pesma;
import java.util.List;

/**
 *
 * @author nevenac
 */
public class SOVratiSvePesme extends OpstaSO{

    private List<Pesma> p;

    public List<Pesma> getP() {
        return p;
    }

    public void setP(List<Pesma> p) {
        this.p = p;
    }
    
    @Override
    protected void izvrsiKonkretnuOperaciju(Pesma odo) throws Exception {
        p = dbb.vratiSve();
    }
    
}
