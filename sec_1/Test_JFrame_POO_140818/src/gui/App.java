package gui;

import modelo.Computador;



public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        
        Computador comp = new Computador();
        
        comp.marca = "HP";
        comp.almcenamiento = "2TB";
        comp.descripcion = "Compu de i7";
        comp.modelo = "hm3200";
        comp.precio = 450000;
        comp.velRam = "3200MHz";
        
        Computador com1 = new Computador();
        com1.marca = "Compaq";
        com1.almcenamiento = "1TB";
        com1.descripcion = "Comprelo mi rey";
        com1.modelo = "hm-7333";
        com1.precio = 700000;
        com1.velRam = "1333MHz";
        
        comp.apagar();
        com1.apagar();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
