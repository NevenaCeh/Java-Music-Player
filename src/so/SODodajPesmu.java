/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Pesma;

/**
 *
 * @author Nevena
 */
public class SODodajPesmu extends OpstaSO{

    private Pesma p;

    public Pesma getP() {
        return p;
    }

    public void setP(Pesma p) {
        this.p = p;
    }

    @Override
    protected void izvrsiKonkretnuOperaciju(Pesma odo) throws Exception {
        p = dbb.unos(odo);
    }
    
}
