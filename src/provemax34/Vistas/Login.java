
package provemax34.Vistas;

import java.awt.Color;
import javax.swing.JPanel;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInfoRegistro = new javax.swing.JPanel();
        jpRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JPanel();
        txtRegistrarse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JPanel();
        txtIniciar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JPanel();
        txtRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInfoRegistro.setBackground(new java.awt.Color(51, 51, 51));
        jpInfoRegistro.setForeground(new java.awt.Color(51, 51, 51));
        jpInfoRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jpRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jpRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provemax34/Imagenes/logo_empresa.png"))); // NOI18N

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));

        txtRegistrarse.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrarse.setText("REGISTRARSE");
        txtRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRegistrarseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarseLayout = new javax.swing.GroupLayout(btnRegistrarse);
        btnRegistrarse.setLayout(btnRegistrarseLayout);
        btnRegistrarseLayout.setHorizontalGroup(
            btnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        btnRegistrarseLayout.setVerticalGroup(
            btnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jpInfoRegistro.add(jpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIAR SESIÓN");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provemax34/Imagenes/icono_usuario.png"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provemax34/Imagenes/icono_contraseña.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("USUARIO");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CONTRASEÑA");

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setText("Ingrese su usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setText("********");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));

        txtIniciar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtIniciar.setForeground(new java.awt.Color(255, 255, 255));
        txtIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIniciar.setText("INICIAR");
        txtIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(txtPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jpInfoRegistro.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 430, 520));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre y Apellido");
        jpInfoRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");
        jpInfoRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        jpInfoRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DNI");
        jpInfoRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jpInfoRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 10));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jpInfoRegistro.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 310, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jpInfoRegistro.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, -1));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jpInfoRegistro.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, -1));

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jpInfoRegistro.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, -1));

        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jpInfoRegistro.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jpInfoRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jpInfoRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 10));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jpInfoRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 10));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setForeground(new java.awt.Color(102, 102, 102));

        txtRegistrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistrar.setText("Registrar");
        txtRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jpInfoRegistro.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 170, 50));

        getContentPane().add(jpInfoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMouseEntered
        btnIniciar.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_txtIniciarMouseEntered

    private void txtIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMouseExited
        btnIniciar.setBackground(Color.black);
    }//GEN-LAST:event_txtIniciarMouseExited

    private void txtRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarseMouseEntered
        btnRegistrarse.setBackground(Color.gray);
    }//GEN-LAST:event_txtRegistrarseMouseEntered

    private void txtRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarseMouseExited
        btnRegistrarse.setBackground(Color.white);
    }//GEN-LAST:event_txtRegistrarseMouseExited

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if(txtUser.getText().equals("Ingrese su usuario")){
        txtUser.setText("");
        txtUser.setForeground(Color.black);
        }
        if(String.valueOf(txtPass.getPassword()).isEmpty()){
        txtPass.setText("********");
        txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if(String.valueOf(txtPass.getPassword()).equals("********")){
        txtPass.setText("");
        txtPass.setForeground(Color.black);
        }
        if(txtUser.getText().isEmpty()){
        txtUser.setText("Ingrese su usuario");
        txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void txtRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarseMouseClicked
        jPanelXIzquierda(0, -400, 10, 5, jpRegistro);
    }//GEN-LAST:event_txtRegistrarseMouseClicked

    private void txtRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarMouseEntered
        btnRegistrar.setBackground(Color.black);
    }//GEN-LAST:event_txtRegistrarMouseEntered

    private void txtRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarMouseExited
        btnRegistrar.setBackground(Color.gray);
    }//GEN-LAST:event_txtRegistrarMouseExited

    private void txtRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarMouseClicked
        jPanelXDerecha(-400, 0, 10, 5, jpRegistro);
    }//GEN-LAST:event_txtRegistrarMouseClicked

    private void txtIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarMouseClicked
        Menu menu= new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_txtIniciarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jpInfoRegistro;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JLabel txtIniciar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtRegistrarse;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
public void jPanelXIzquierda(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getX() == start) {
            new Thread() {
                public void run() {
                    while (JPanel.getX() > stop) {
                        for (int i = start; i >= stop; i -= increment) {
                            try {
                                Thread.sleep(delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    JPanel.setLocation(stop, JPanel.getY());
                }
            }.start();
        }
    }
public void jPanelXDerecha(final int start, final int stop, final int delay, final int increment, final JPanel JPanel) {
        if (JPanel.getX() == start) {
            new Thread() {
                public void run() {
                    while (JPanel.getX() <= start) {
                        for (int i = start; i <= stop; i += increment) {
                            try {
                                Thread.sleep(delay);

                                JPanel.setLocation(i, JPanel.getY());
                            } catch (InterruptedException e) {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    JPanel.setLocation(stop, JPanel.getY());
                }
            }.start();
        }
    }

}
