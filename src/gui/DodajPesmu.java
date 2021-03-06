/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Pesma;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import kontroler.Kontroler;

/**
 *
 * @author nevenac
 */
public class DodajPesmu extends javax.swing.JDialog {

    /**
     * Creates new form DodajPesmu
     */
    File fajl;
    
    public DodajPesmu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnNadji = new javax.swing.JButton();
        jtfPesma = new javax.swing.JTextField();
        jbtnSacuvaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbtnNadji.setText("Nadji pesmu");
        jbtnNadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNadjiActionPerformed(evt);
            }
        });

        jtfPesma.setEditable(false);

        jbtnSacuvaj.setText("Sacuvaj pesmu");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfPesma, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jbtnNadji)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNadji)
                    .addComponent(jtfPesma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jbtnSacuvaj)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNadjiActionPerformed
        // TODO add your handling code here:
        JFileChooser chose = new JFileChooser();
        chose.showOpenDialog(this);
        File file = chose.getSelectedFile();
        fajl = file;
        String t = file.getName();
        jtfPesma.setText(t);
        System.out.println(t);
    }//GEN-LAST:event_jbtnNadjiActionPerformed

    private void jbtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajActionPerformed
        // TODO add your handling code here:
       String ime = fajl.getName();
       String putanja = fajl.getAbsolutePath();
       Pesma p = new Pesma(ime, putanja);
       boolean sac = Kontroler.getInstance().sacuvajPesmu(p);
        if (sac) {
            JOptionPane.showMessageDialog(this, "Sacuvana pesma");
        }else{
            JOptionPane.showMessageDialog(this, "Nije sacuvana pesma");
        }
    }//GEN-LAST:event_jbtnSacuvajActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnNadji;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JTextField jtfPesma;
    // End of variables declaration//GEN-END:variables
}
