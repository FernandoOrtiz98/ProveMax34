/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import provemax34.AccesoData.ProductoData;
import provemax34.Entidades.Producto;

public class AgregarProducto extends javax.swing.JFrame {
   
    private Producto prod = null;
    private ProductoData prodData = new ProductoData();

    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        prod = new Producto();
        prodData = new ProductoData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelSecundario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jTCantidad = new javax.swing.JTextField();
        btnAgregarProd = new javax.swing.JPanel();
        txtAgregarProd = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSecundario.setBackground(new java.awt.Color(0, 0, 0));
        PanelSecundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion");
        PanelSecundario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stock");
        PanelSecundario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jTDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 323, -1));

        jTCantidad.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, -1));

        btnAgregarProd.setBackground(new java.awt.Color(255, 255, 255));

        txtAgregarProd.setBackground(new java.awt.Color(255, 255, 255));
        txtAgregarProd.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtAgregarProd.setForeground(new java.awt.Color(0, 0, 0));
        txtAgregarProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregarProd.setText("Agregar");
        txtAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAgregarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarProdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarProdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarProdLayout = new javax.swing.GroupLayout(btnAgregarProd);
        btnAgregarProd.setLayout(btnAgregarProdLayout);
        btnAgregarProdLayout.setHorizontalGroup(
            btnAgregarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarProdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnAgregarProdLayout.setVerticalGroup(
            btnAgregarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarProdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelSecundario.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio Actual");
        PanelSecundario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTPrecio.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 269, 100, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        PanelSecundario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 324, -1));

        jPanel1.add(PanelSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgregarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseEntered
        btnAgregarProd.setBackground(Color.gray);
    }//GEN-LAST:event_txtAgregarProdMouseEntered

    private void txtAgregarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseExited
        btnAgregarProd.setBackground(Color.white);
    }//GEN-LAST:event_txtAgregarProdMouseExited

    private void txtAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseClicked

        
        try {
            String nombre = jTNombre.getText();
            String descr = jTDescripcion.getText();
            double precio = Double.parseDouble(jTPrecio.getText());
            int cantidad = Integer.parseInt(jTCantidad.getText());
            
            if (nombre.isEmpty() || descr.isEmpty() || precio <= 0 || cantidad <= 0 || !(Character.isDigit((int) precio)) || !(Character.isDigit((int) cantidad))) {
                JOptionPane.showMessageDialog(this, "Error al llenar el formulario, verificar campos...");
            } else {
                prod = new Producto(nombre, descr, precio, cantidad, true);
                prodData.guardarProducto(prod);
                prod = null; 
                limpiarCampos();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatible");
            limpiarCampos();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Completar datos");
        }

    }//GEN-LAST:event_txtAgregarProdMouseClicked

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
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSecundario;
    private javax.swing.JPanel btnAgregarProd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JLabel txtAgregarProd;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {

        jTNombre.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTCantidad.setText("");
        prod = null;

    }
}
    
