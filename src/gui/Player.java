/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.FileInputStream;

/**
 *
 * @author nevenac
 */
public class Player extends javax.swing.JFrame {

    /**
     * Creates new form Player
     */
    public Player() {
        initComponents();
    }

    Player(FileInputStream fis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiDodajPesmu = new javax.swing.JMenuItem();
        jmiSvePesme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Pesme");

        jmiDodajPesmu.setText("Dodaj pesmu");
        jmiDodajPesmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajPesmuActionPerformed(evt);
            }
        });
        jMenu2.add(jmiDodajPesmu);

        jmiSvePesme.setText("Sve pesme");
        jmiSvePesme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSvePesmeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSvePesme);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDodajPesmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajPesmuActionPerformed
        // TODO add your handling code here:
        DodajPesmu dp = new DodajPesmu(this, true);
        dp.setVisible(true);                
    }//GEN-LAST:event_jmiDodajPesmuActionPerformed

    private void jmiSvePesmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSvePesmeActionPerformed
        // TODO add your handling code here:
        SvePesme sve = new SvePesme(this, true);
        sve.setVisible(true);
    }//GEN-LAST:event_jmiSvePesmeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiDodajPesmu;
    private javax.swing.JMenuItem jmiSvePesme;
    // End of variables declaration//GEN-END:variables
}
