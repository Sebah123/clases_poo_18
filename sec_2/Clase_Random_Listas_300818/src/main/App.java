package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Alumno;
import javax.swing.JOptionPane; // mensajes

public class App extends javax.swing.JFrame {

    private List<Alumno> listaAlumnos;
    private int suma; // acumulador
    private Random ran;
    private int cont;
    private List<Integer> numeros;

    public App() {
        initComponents();

        setTitle("Randomize! v0.1");
//        setCentered(true);
        setResizable(false);

        suma = 0;
        listaAlumnos = new ArrayList<>();
        ran = new Random();
        cont = 0;

//        int num1 = 1;
//        Integer num2 = 2;
//        
//        Integer num3 = new Integer("123123");
        validarBotonAzar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnAlAzar = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        lblCantAlum = new javax.swing.JLabel();
        lblPromAnios = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miLimpiar = new javax.swing.JMenuItem();
        miAzar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del alumno"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAlAzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dice.png"))); // NOI18N
        btnAlAzar.setText("AL azar!");
        btnAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlAzarActionPerformed(evt);
            }
        });

        lblDatos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(255, 0, 0));
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantAlum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantAlum.setText("Cantidad de alumnos: 0");

        lblPromAnios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPromAnios.setText("Promedio de años: 0");

        jMenu1.setText("Archivo");

        miLimpiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        miLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clean.png"))); // NOI18N
        miLimpiar.setText("Limpiar");
        miLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLimpiarActionPerformed(evt);
            }
        });
        jMenu1.add(miLimpiar);

        miAzar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        miAzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mini_dice.png"))); // NOI18N
        miAzar.setText("Al azar!");
        miAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAzarActionPerformed(evt);
            }
        });
        jMenu1.add(miAzar);
        jMenu1.add(jSeparator1);

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu1.add(miSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem4.setText("About");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblPromAnios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantAlum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPromAnios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre;
        int edad;

        nombre = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());

        // si se escribió algo (en el nombre por ahora)
        // nombre.isEmpty() == false
        if (!nombre.isEmpty()) {
            // debo registrar
            Alumno al = new Alumno(nombre, edad);

            listaAlumnos.add(al);
            suma += edad; // suma = suma + edad;

            lblCantAlum.setText("Cantidad de alumnos: " + listaAlumnos.size());
            lblPromAnios.setText("Promedio: " + (suma / listaAlumnos.size()));

            // limpiar componentes
            txtNombre.setText(null);
            txtEdad.setText(null);
            // limpiar componentes

            // 
            txtNombre.requestFocus();

            listarAlumnosConsola();
            validarBotonAzar();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlAzarActionPerformed
        alAzar();
    }//GEN-LAST:event_btnAlAzarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // la tecla es enter????
        System.out.println("IF de la muerte --> " + (cont++));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEdad.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_txtEdadKeyReleased

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        salir();
    }//GEN-LAST:event_miSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Recordar cambiar en las propiedades
        // del formulario, la primera propiedad
        // defaultCloseOperation por DO_NOTHING
        // o si no, troll!
        salir();
    }//GEN-LAST:event_formWindowClosing

    private void miAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAzarActionPerformed
        alAzar();
    }//GEN-LAST:event_miAzarActionPerformed

    private void miLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLimpiarActionPerformed
        lblDatos.setText(null);
        txtEdad.setText(null);
        txtNombre.setText(null);
    }//GEN-LAST:event_miLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlAzar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCantAlum;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblPromAnios;
    private javax.swing.JMenuItem miAzar;
    private javax.swing.JMenuItem miLimpiar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setCentered(boolean b) {
        if (b) {
            setLocationRelativeTo(null); // centrado del formulario
        }
    }

    /**
     * Acá veo si existen Alumnos en la lista y en base a aquello, habilito o
     * inhabilito el botón azar
     */
    private void validarBotonAzar() {
        if (listaAlumnos.isEmpty()) {
            btnAlAzar.setEnabled(false);
            miAzar.setEnabled(false);
        } else {
            btnAlAzar.setEnabled(true);
            miAzar.setEnabled(true);
        }
    }

    private void listarAlumnosConsola() {
        System.out.println("------------------------");
        System.out.println("Listado de alumnos");
        System.out.println("------------------------");
        for (Alumno alum : listaAlumnos) {
            System.out.println(alum.getNombre() + " - " + alum.getEdad());
        }
        System.out.println("------------------------");
    }

    private void salir() {
        // si salir == si
        if(JOptionPane.showConfirmDialog(
            this, 
            "Salir?", 
            "Mensaje", 
            JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION){
            
            // tipos mensaje:
            // INFORMATION, WARNING, ERROR, PLANE
            JOptionPane.showMessageDialog(
                this, 
                "Gracias por utilizar la app", 
                "Mensaje", 
                JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
        }
    }

    private void alAzar() {
        // genero un índice aleatorio
        int numRandom = ran.nextInt(listaAlumnos.size());

        System.out.println("RANDOM --> " + numRandom);

        Alumno alum = listaAlumnos.get(numRandom);
        lblDatos.setText(alum.getNombre() + " - " + alum.getEdad() + " años");
    }
}
