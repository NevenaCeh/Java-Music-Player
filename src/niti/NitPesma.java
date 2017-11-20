/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import domen.Pesma;
import java.io.FileInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author nevenac
 */
public class NitPesma extends Thread {

    private boolean played;
    private Player playMP3;

    public NitPesma(FileInputStream fis) {
        played = false;
        try {
            playMP3 = new Player(fis);
        } catch (JavaLayerException ex) {
            Logger.getLogger(NitPesma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void play() {
        //playMP3.play();
        played = true;
        start();
    }

    public void stoppesmu() {
        playMP3.close();
        played = false;
    }

    public void playall() {
        playMP3.close();
        played = true;
    }

    @Override
    public void run() {
        while (played) {
            try {
                playMP3.play();
            } catch (Exception se) {
                System.out.println("Server zaustavljen!");
            }
        }
    }

    public boolean gotovaPesma() {
        return playMP3.isComplete();
    }

    public synchronized void close() {
        playMP3.close();
    }
    
    

}
