/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.practicotres.Vistas;

import com.mycompany.practicotres.DirectorioTelefonico;
import javax.swing.JOptionPane;

/**
 *
 * @author ezequ
 */
public class BuscarTelefonosPorApellido extends javax.swing.JInternalFrame {

    DirectorioTelefonico paginasNaranjas = new DirectorioTelefonico();
    /**
     * Creates new form BuscarTelefonosPorApellido
     */
    public BuscarTelefonosPorApellido(DirectorioTelefonico paginasNaranjas) {
        initComponents();
        this.paginasNaranjas = paginasNaranjas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        Jdni5 = new javax.swing.JLabel();
        JTFbuscartelefonoporapellido = new javax.swing.JTextField();
        jbotonbuscartelefonoporapellido = new javax.swing.JButton();

        setClosable(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar telefonos por apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 24))); // NOI18N

        Jdni5.setText("Apellido");

        JTFbuscartelefonoporapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFbuscartelefonoporapellidoActionPerformed(evt);
            }
        });

        jbotonbuscartelefonoporapellido.setText("Buscar");
        jbotonbuscartelefonoporapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonbuscartelefonoporapellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jdni5)
                .addGap(18, 18, 18)
                .addComponent(JTFbuscartelefonoporapellido)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jbotonbuscartelefonoporapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jdni5)
                    .addComponent(JTFbuscartelefonoporapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jbotonbuscartelefonoporapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFbuscartelefonoporapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFbuscartelefonoporapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFbuscartelefonoporapellidoActionPerformed

    private void jbotonbuscartelefonoporapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonbuscartelefonoporapellidoActionPerformed
        // TODO add your handling code here:

        // busca telefonos por apellido
        if (paginasNaranjas.buscarTelefono(JTFbuscartelefonoporapellido.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "No exiten clientes con ese apellido\n");
        } else {
            JOptionPane.showMessageDialog(null, "Telefons de clientes que tiene este apellido : " + JTFbuscartelefonoporapellido.getText() + "\n" + paginasNaranjas.buscarTelefono(JTFbuscartelefonoporapellido.getText()));

        }
    }//GEN-LAST:event_jbotonbuscartelefonoporapellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFbuscartelefonoporapellido;
    private javax.swing.JLabel Jdni5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbotonbuscartelefonoporapellido;
    // End of variables declaration//GEN-END:variables
}
