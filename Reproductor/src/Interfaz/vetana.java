/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class vetana extends javax.swing.JFrame {

    /**
     * Creates new form vetana
     */
    public vetana() {
        initComponents();
        setLocationRelativeTo(null);    //Se coloca la ventana en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Correo = new javax.swing.JTextField();
        botonEntrar = new javax.swing.JButton();
        CEMusiicPlayer = new javax.swing.JLabel();
        FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(0, 51, 204));
        Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 80, 40));

        Usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("Usuario:");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 40));

        Password.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Contraseña:");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        Contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 200, 40));

        Correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 40));

        botonEntrar.setBackground(new java.awt.Color(51, 51, 255));
        botonEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(51, 51, 51));
        botonEntrar.setText("Inicar Sesión");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 110, 40));

        CEMusiicPlayer.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        CEMusiicPlayer.setForeground(new java.awt.Color(0, 0, 0));
        CEMusiicPlayer.setText("CE Music Player");
        jPanel1.add(CEMusiicPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 340, 60));

        FondoLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondologin.png"))); // NOI18N
        jPanel1.add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 456));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0); // Funcionalidad del boton salir
    }//GEN-LAST:event_SalirActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        String CorreoCorrecto = "datos1";
        String ContraseñaCorrecta = "datos1s2";
        
        if(CorreoCorrecto.equals(Correo.getText())){
            String contraseña = ""; // Variable para poder copiar el texto de password
            
            for(int i=0;i<Contraseña.getPassword().length;i++){
                contraseña += Contraseña.getPassword()[i]; //Copiar contraseña ingresada
           
            }
            if(ContraseñaCorrecta.equals(contraseña)){ //si se cumple, se ingresa al reproductor
                    JOptionPane.showMessageDialog(null,"usuario Válido");
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
            }
        }
        else{
            JOptionPane.showMessageDialog (null,"El usuario no existe");
            
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vetana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vetana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEMusiicPlayer;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
