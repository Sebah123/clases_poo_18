package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Calculadora;

public class App extends javax.swing.JFrame {

    public App() {

        initComponents();

        lblNombre.setText("Bill Gates");
        lblOficio.setText("Desarrollador de apps cool");
        lblAnio.setText("2018");
        tpAplicacion.setSelectedIndex(2);
        opMasculino.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        tpAplicacion = new javax.swing.JTabbedPane();
        pnlCalculadora = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        pnlAutor = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblOficio = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        opFemenino = new javax.swing.JRadioButton();
        opMasculino = new javax.swing.JRadioButton();
        chkLinux = new javax.swing.JCheckBox();
        chkMac = new javax.swing.JCheckBox();
        chkWin = new javax.swing.JCheckBox();
        btnRadio = new javax.swing.JButton();
        btnVotar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkMinecraft = new javax.swing.JCheckBox();
        chkFornite = new javax.swing.JCheckBox();
        Terraria = new javax.swing.JCheckBox();
        btnVota = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pruebas java");

        jLabel1.setText("Número 1:");

        jLabel2.setText("Número 2:");

        jLabel3.setText("Nombre:");

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlCalculadoraLayout = new javax.swing.GroupLayout(pnlCalculadora);
        pnlCalculadora.setLayout(pnlCalculadoraLayout);
        pnlCalculadoraLayout.setHorizontalGroup(
            pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                        .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtNum1)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        pnlCalculadoraLayout.setVerticalGroup(
            pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tpAplicacion.addTab("Calculadora", pnlCalculadora);

        pnlAutor.setBackground(new java.awt.Color(0, 0, 0));

        lblNombre.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("[Nombre]");

        lblOficio.setForeground(new java.awt.Color(255, 51, 0));
        lblOficio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOficio.setText("[Oficio]");

        lblAnio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(204, 204, 255));
        lblAnio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnio.setText("[Anio]");

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/autor.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlAutorLayout = new javax.swing.GroupLayout(pnlAutor);
        pnlAutor.setLayout(pnlAutorLayout);
        pnlAutorLayout.setHorizontalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(lblAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOficio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAutorLayout.setVerticalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOficio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpAplicacion.addTab("Autor", pnlAutor);

        grupoSexo.add(opFemenino);
        opFemenino.setSelected(true);
        opFemenino.setText("Femenino");
        opFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFemeninoActionPerformed(evt);
            }
        });

        grupoSexo.add(opMasculino);
        opMasculino.setText("Masculino");

        chkLinux.setText("GNU / Linux");
        chkLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLinuxActionPerformed(evt);
            }
        });

        chkMac.setText("Mac OS");

        chkWin.setText("Windows");

        btnRadio.setText("Procesar radios");
        btnRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioActionPerformed(evt);
            }
        });

        btnVotar.setText("Votar");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        jLabel4.setText("¿Que sistema utilizas?");

        jLabel5.setText("¿Sexo?");

        jLabel6.setText("favorito?");

        chkMinecraft.setText("Minecraft");

        chkFornite.setText("Fornite");

        Terraria.setText("Terraria");

        btnVota.setText("Votar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opMasculino)
                    .addComponent(opFemenino)
                    .addComponent(btnRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkMac)
                    .addComponent(chkLinux)
                    .addComponent(chkWin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnVotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMinecraft)
                    .addComponent(chkFornite)
                    .addComponent(Terraria)
                    .addComponent(btnVota, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRadio)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkLinux)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkWin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVotar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(chkMinecraft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkFornite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Terraria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVota)))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        tpAplicacion.addTab("Pruebas", jPanel1);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opción 2");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Opción n");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpAplicacion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpAplicacion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        try {
            // evento de acción

            // 1.- Rescatar los datos del formulario
            String nombre;
            int num1, num2;

            nombre = txtNombre.getText();
            // int(input())
            // Integer.parse(txtNum1.getText())
            num1 = Integer.parseInt(txtNum1.getText());
            num2 = Integer.parseInt(txtNum2.getText());

            // 2.- Construir un objeto Calculadora con esos datos
            Calculadora c = new Calculadora(nombre, num1, num2);

            // 3.- Llamar al método getSuma()
            int suma = c.getSuma();

            // 4.- Muestro la suma en un label
            lblResultado.setText(c.getNombre() + ", la suma es: " + suma);
//        lblResultado.setText(""+suma);
//        lblResultado.setText(String.valueOf(suma));
//        lblResultado.setText(Integer.toString(suma));

            // 5.- Limpio el formulario
            txtNombre.setText(null);
            txtNum1.setText("");
            txtNum2.setText(null);

            txtNombre.requestFocus(); // dejar el cursor en el componente
            // en este caso es el nombre
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No sea tiern@, solo números");
        }

    }//GEN-LAST:event_btnSumarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void opFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opFemeninoActionPerformed

    private void btnRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioActionPerformed
        if (opFemenino.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted es mujer");
        } else {
            JOptionPane.showMessageDialog(this, "Usted es hombre");
        }
    }//GEN-LAST:event_btnRadioActionPerformed

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        if (chkLinux.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted usa Linux");
        }
        if (chkMac.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted usa Mac");
        }
        if (chkWin.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted usa Win");
        } 
//        if (chkLinux.isSelected() && chkMac.isSelected()) {
//            JOptionPane.showMessageDialog(this, "Usted usa GNU whit Linux y Mac");
//        } 
//        if (chkMac.isSelected() && chkWin.isSelected()) {
//            JOptionPane.showMessageDialog(this, "Usted usa Mac y Windows");
//        } 
//        if (chkLinux.isSelected() && chkWin.isSelected()) {
//            JOptionPane.showMessageDialog(this, "Usted usa GNU whit Linux y Windows");
//        }
//        if (chkLinux.isSelected() && chkMac.isSelected() && chkWin.isSelected()) {
//            JOptionPane.showMessageDialog(this, "Usted usa GNU whit Linux, Mac OS y Windows");
//        }
        
    }//GEN-LAST:event_btnVotarActionPerformed

    private void chkLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLinuxActionPerformed

    public static void main(String args[]) {

        try {
            // cargando el look and feel (tema) del sistema operativo actual
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Terraria;
    private javax.swing.JButton btnRadio;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnVota;
    private javax.swing.JButton btnVotar;
    private javax.swing.JCheckBox chkFornite;
    private javax.swing.JCheckBox chkLinux;
    private javax.swing.JCheckBox chkMac;
    private javax.swing.JCheckBox chkMinecraft;
    private javax.swing.JCheckBox chkWin;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOficio;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton opFemenino;
    private javax.swing.JRadioButton opMasculino;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlCalculadora;
    private javax.swing.JTabbedPane tpAplicacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
