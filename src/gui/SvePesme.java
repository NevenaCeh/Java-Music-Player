/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Pesma;
import gui.komponente.TblModelPesme;
import java.io.FileInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kontroler.Kontroler;

/**
 *
 * @author nevenac
 */
public class SvePesme extends javax.swing.JDialog {

    /**
     * Creates new form SvePesme
     */
    public SvePesme(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        postaviTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlblNazivPesme = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPesme = new javax.swing.JTable();
        jbtnPlayAll = new javax.swing.JButton();
        jbtnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/MusicWorkShop-Image.jpg"))); // NOI18N

        jlblNazivPesme.setText("Sve pesme");

        jtblPesme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblPesme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPesmeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblPesme);

        jbtnPlayAll.setText("Play All");
        jbtnPlayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlayAllActionPerformed(evt);
            }
        });

        jbtnStop.setText("Stop");
        jbtnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblNazivPesme)
                            .addGap(92, 92, 92)
                            .addComponent(jbtnPlayAll, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)
                            .addComponent(jbtnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNazivPesme)
                    .addComponent(jbtnPlayAll)
                    .addComponent(jbtnStop))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblPesmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPesmeMouseClicked
      
        int red = jtblPesme.getSelectedRow();
        TblModelPesme model = (TblModelPesme) jtblPesme.getModel();
        List<Pesma> pesme = model.getPesme();
        Pesma zaplay = pesme.get(red);
        PesmaGUI pgui = new PesmaGUI(new Player(), true, zaplay, pesme);
        pgui.setVisible(true);
    }//GEN-LAST:event_jtblPesmeMouseClicked

    private void jbtnPlayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlayAllActionPerformed
        TblModelPesme model = (TblModelPesme) jtblPesme.getModel();
        List<Pesma> pesme = model.getPesme();
        for (Pesma pesma : pesme) {
            Kontroler.getInstance().pokreniPesmu(pesma);
        }
    }//GEN-LAST:event_jbtnPlayAllActionPerformed

    private void jbtnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStopActionPerformed
        Kontroler.getInstance().zaustaviPesmu();
    }//GEN-LAST:event_jbtnStopActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnPlayAll;
    private javax.swing.JButton jbtnStop;
    private javax.swing.JLabel jlblNazivPesme;
    private javax.swing.JTable jtblPesme;
    // End of variables declaration//GEN-END:variables

    private void postaviTabelu()  {
        try {
            List<Pesma> pesme = Kontroler.getInstance().vratiSvePesme();
            jtblPesme.setModel(new TblModelPesme(pesme));
        } catch (Exception ex) {
            Logger.getLogger(SvePesme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
