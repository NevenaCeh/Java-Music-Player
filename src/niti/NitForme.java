/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

/**
 *
 * @author nevenac
 */
public class NitForme extends Thread{
    
    NitPesma np;

    public NitForme(NitPesma np) {
        this.np = np;
    }

    @Override
    public void run() {
        np.start();
    }
    
    
    
}
