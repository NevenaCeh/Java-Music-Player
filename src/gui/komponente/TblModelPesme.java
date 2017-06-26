/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.komponente;

import domen.Pesma;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nevenac
 */
public class TblModelPesme extends AbstractTableModel{

    List<Pesma> pesme;

    public TblModelPesme(List<Pesma> sluzbenici) {
        this.pesme = sluzbenici;
    }
    
    @Override
    public int getRowCount() {
        return pesme.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pesma odo = pesme.get(rowIndex);
        switch(columnIndex){
            case 0: return odo.getNaziv();
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return "Pesma";
    }

    public List<Pesma> getPesme() {
        return pesme;
    }

    public void setPesme(List<Pesma> pesme) {
        this.pesme = pesme;
    }
    
    
    
}
