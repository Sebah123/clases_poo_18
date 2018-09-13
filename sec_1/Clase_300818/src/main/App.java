package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Alumno;
import model.TMAlumno;

public class App extends javax.swing.JFrame {

    private Random ran;
    private List<Alumno> listaAlumnos;
    private final String VERSION = "v0.2";
    private int contIds; // para generar los ids
    private TMAlumno modelAlumno;

    public App() {
        initComponents();
        ran = new Random();
        listaAlumnos = new ArrayList<>();
        setTitle("Alumnos Random " + VERSION);

        setCentered(true);
        setResizable(false);
        contIds = 0;
        
        modelAlumno = new TMAlumno(listaAlumnos);
        tblNombres.setModel(modelAlumno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnAzar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnWarn = new javax.swing.JButton();
        btnError = new javax.swing.JButton();
        btnPlane = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNombres = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/registrar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/random.png"))); // NOI18N
        btnAzar.setText("Al azar!");
        btnAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("[acá va el nombre]");
        lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad.setText("Cantidad de nombres: 0");

        btnInfo.setText("Information");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnWarn.setText("Warning");
        btnWarn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarnActionPerformed(evt);
            }
        });

        btnError.setText("Error");
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });

        btnPlane.setText("Plane");
        btnPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneActionPerformed(evt);
            }
        });

        btnConfirm.setText("Mensaje de confirmación");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jButton1.setText("Mensaje de confirmación [\"clara\"]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAzar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWarn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnError, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAzar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfo)
                            .addComponent(btnWarn)
                            .addComponent(btnError)
                            .addComponent(btnPlane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            btnRegistrar.doClick();
            registrar();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzarActionPerformed
        int size = listaAlumnos.size();
        if (size > 0) {
            int numRandom = ran.nextInt(size);
            System.out.println("RANDOM --> " + numRandom);

            Alumno a = listaAlumnos.get(numRandom);
            lblNombre.setText(a.getId()+" - "+a.getNombre());
        }
    }//GEN-LAST:event_btnAzarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(
            this, 
            "Mensaje información", 
            "Título", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnWarnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarnActionPerformed
        JOptionPane.showMessageDialog(
            this, 
            "Mensaje de advertencia", 
            "Título", 
            JOptionPane.WARNING_MESSAGE
        );
    }//GEN-LAST:event_btnWarnActionPerformed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        JOptionPane.showMessageDialog(
            this, 
            "Mensaje de error", 
            "Título", 
            JOptionPane.ERROR_MESSAGE
        );
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneActionPerformed
        JOptionPane.showMessageDialog(
            this, 
            "Mensaje plano", 
            "Título", 
            JOptionPane.PLAIN_MESSAGE
        );
    }//GEN-LAST:event_btnPlaneActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Salir?", "Título", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String mensaje  = "Salir? [\"Clara\"]";
        String titulo   = "Título";
        int tipo        = JOptionPane.YES_NO_CANCEL_OPTION;
        int respSi      = JOptionPane.YES_OPTION;
        
        
        if(JOptionPane.showConfirmDialog(
            txtNombre, 
            mensaje, 
            titulo, 
            tipo
        ) == respSi){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(this, "Salir?", "Título", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzar;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnPlane;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnWarn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblNombres;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void registrar() {
        String nombre = txtNombre.getText();
        if (!nombre.trim().isEmpty()) {
            Alumno a = new Alumno();
            
            // cont++ , ++cont
//            contIds++;
            a.setNombre(nombre);
            a.setId(++contIds);
            
            listaAlumnos.add(a);

            lblCantidad.setText("Cantidad de nombres: " + listaAlumnos.size());

            txtNombre.setText(null);
            txtNombre.requestFocus();
            // Actualiza la interfaz gráfica de la tabla
            tblNombres.updateUI();
            
//            int cont = 1;
//            System.out.println("------------------");
//            System.out.println("Listado de alumnos");
//            System.out.println("------------------");
//            for (String nom : listaNombres) {
//                System.out.println(cont+") "+nom);
//                cont++;
//            }
//            System.out.println("------------------");
        }
    }

    private void setCentered(boolean bool) {
        if (bool) {
            setLocationRelativeTo(null);
        }

    }
}
