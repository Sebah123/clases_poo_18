package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Alumno;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAlAzar.setText("AL azar!");
        btnAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlAzarActionPerformed(evt);
            }
        });

        lblDatos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(255, 0, 0));
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setText("[Datos aquí]");
        lblDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantAlum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantAlum.setText("Cantidad de alumnos: 0");

        lblPromAnios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPromAnios.setText("Promedio de años: 0");

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
                .addComponent(btnAlAzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(!nombre.isEmpty()){
            // debo registrar
            Alumno al = new Alumno(nombre, edad);
            
            listaAlumnos.add(al);
            suma += edad; // suma = suma + edad;
            
            lblCantAlum.setText("Cantidad de alumnos: "+listaAlumnos.size());
            lblPromAnios.setText("Promedio: "+(suma / listaAlumnos.size()));
            
            // limpiar componentes
            txtNombre.setText(null);
            txtEdad.setText(null);
            // limpiar componentes
            
            // 
            txtNombre.requestFocus();
            
            System.out.println("------------------------");
            System.out.println("Listado de alumnos");
            System.out.println("------------------------");
            for (Alumno alum : listaAlumnos) {
                System.out.println(alum.getNombre()+" - "+alum.getEdad());
            }
            System.out.println("------------------------");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlAzarActionPerformed
        // genero un índice aleatorio
        int numRandom = ran.nextInt(listaAlumnos.size());
        
        System.out.println("RANDOM --> "+numRandom);
        
        Alumno alum = listaAlumnos.get(numRandom);
        lblDatos.setText(alum.getNombre()+" - "+alum.getEdad()+" años");
        
    }//GEN-LAST:event_btnAlAzarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // la tecla es enter????
        System.out.println("IF de la muerte --> "+(cont++));
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEdad.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_txtEdadKeyReleased

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantAlum;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblPromAnios;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setCentered(boolean b) {
        if(b)
            setLocationRelativeTo(null); // centrado del formulario
    }
}
