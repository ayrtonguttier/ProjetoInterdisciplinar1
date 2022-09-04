/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.Telas;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.Objeto2D;
import java.util.List;

/**
 *
 * @author ayrtonguttier
 */
public class TelaObjetos2d extends javax.swing.JDialog {

    /**
     * Creates new form TelaObjetos2d
     */
    public TelaObjetos2d(java.awt.Frame parent, boolean modal) {
        super(parent, modal);               
        initComponents();
        setLocationRelativeTo(parent); 
    }

    public void exibir(List<Objeto2D> objetos) {        
        
        for (Objeto2D objeto : objetos) {
            String atual = txtAreaObjetos.getText();
            txtAreaObjetos.setText(String.format("%s%s\n", atual, objeto.toString()));
        }
        
        super.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObjetos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Objetos 2D");

        txtAreaObjetos.setColumns(20);
        txtAreaObjetos.setRows(5);
        jScrollPane1.setViewportView(txtAreaObjetos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaObjetos;
    // End of variables declaration//GEN-END:variables
}
