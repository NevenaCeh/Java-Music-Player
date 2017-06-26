/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author nevenac
 */
public class Pesma {
    
    private int id;
    private String naziv;
    private String lokacija;

    public Pesma() {
    }

    public Pesma(int id, String naziv, String lokacija) {
        this.id = id;
        this.naziv = naziv;
        this.lokacija = lokacija;
    }

    public Pesma(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
