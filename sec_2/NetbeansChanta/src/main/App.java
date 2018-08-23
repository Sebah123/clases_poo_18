package main;

import javax.swing.JOptionPane;


public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        
        txtNombreMain.setEnabled(false);
        txtNombreProyecto.selectAll();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        palomita = new javax.swing.JCheckBox();
        txtNombreMain = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del proyecto:");

        txtNombreProyecto.setText("ProyectName");
        txtNombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProyectoKeyReleased(evt);
            }
        });

        palomita.setText("Crear clase principal:");
        palomita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palomitaMouseReleased(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(palomita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreMain))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palomita)
                    .addComponent(txtNombreMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        String nombre = txtNombreProyecto.getText();
        
        if(nombre.equals("")){
            System.out.println("Escriba algo en el nombre del proyecto");
//            JOptionPane.showMessageDialog(btnFinalizar, "Escriba algo en el nombre del proyecto");
            lblError.setText("Escriba algo en el nombre del proyecto");
        }else{
            System.out.println("El nombre del proyecto es: "+nombre);
        }
        
        
//        System.exit(0);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void palomitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palomitaMouseReleased
        if(palomita.isSelected()){
            txtNombreMain.setEnabled(true);
        }else{
            txtNombreMain.setEnabled(false);
        }
    }//GEN-LAST:event_palomitaMouseReleased

    private void txtNombreProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProyectoKeyReleased
        System.out.println("ENFER");
        String nombre = txtNombreProyecto.getText();
        
        if(nombre.trim().equals("")){
            lblError.setText("Escriba algo en el nombre del proyecto");
            btnFinalizar.setEnabled(false);
        }else{
            lblError.setText(null); // borrar el texto del label
            btnFinalizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtNombreProyectoKeyReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JCheckBox palomita;
    private javax.swing.JTextField txtNombreMain;
    private javax.swing.JTextField txtNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
