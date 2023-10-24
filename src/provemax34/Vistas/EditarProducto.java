/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.Vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import provemax34.AccesoData.ProductoData;
import provemax34.Entidades.Producto;

/**
 *
 * @author Fer
 */
public class EditarProducto extends javax.swing.JFrame {
    private Producto prod=null;
    private ProductoData prodData;
    
    
    public EditarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        prodData=new ProductoData();
        CargarCampos();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JCheckBox();
        btnAgregarProd = new javax.swing.JPanel();
        txtModificarProd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Actual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 308, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stock");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 232, -1, -1));

        jTNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 51, 324, -1));

        jTDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 323, -1));

        jTPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 197, 323, -1));

        jTStock.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 265, 321, -1));
        jPanel1.add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        btnAgregarProd.setBackground(new java.awt.Color(255, 255, 255));

        txtModificarProd.setBackground(new java.awt.Color(255, 255, 255));
        txtModificarProd.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtModificarProd.setForeground(new java.awt.Color(0, 0, 0));
        txtModificarProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificarProd.setText("Modificar");
        txtModificarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarProdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarProdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarProdLayout = new javax.swing.GroupLayout(btnAgregarProd);
        btnAgregarProd.setLayout(btnAgregarProdLayout);
        btnAgregarProdLayout.setHorizontalGroup(
            btnAgregarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        btnAgregarProdLayout.setVerticalGroup(
            btnAgregarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel1.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 331, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModificarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProdMouseEntered
        btnAgregarProd.setBackground(Color.gray);
    }//GEN-LAST:event_txtModificarProdMouseEntered

    private void txtModificarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProdMouseExited
        btnAgregarProd.setBackground(Color.white);
    }//GEN-LAST:event_txtModificarProdMouseExited

    private void txtModificarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProdMouseClicked
      try{
          prod.setNombreProducto(jTNombre.getText());
          prod.setDescripcion(jTDescripcion.getText());
          prod.setPrecioActual(Double.parseDouble(jTPrecio.getText()));
          prod.setStock(Integer.parseInt(jTStock.getText()));
          prod.setEstado(jCBEstado.isSelected());
          prodData.modificarProducto(prod);
          limpiarCampos();
        
      }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Datos incompatible" );
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this,"Completar datos" );
        }

    }//GEN-LAST:event_txtModificarProdMouseClicked

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed


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
                new EditarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarProd;
    private javax.swing.JCheckBox jCBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JLabel txtModificarProd;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
        jTNombre.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTStock.setText("");
        jCBEstado.setEnabled(false);
        prod=null;
    }
public void CargarCampos(){
        prod = prodData.buscarProducto(Productos.idProd);
        jTNombre.setText(prod.getNombreProducto());
        jTDescripcion.setText(prod.getDescripcion());
        jTPrecio.setText(prod.getPrecioActual()+"");
        jTStock.setText(prod.getStock()+"");
        jCBEstado.setSelected(prod.isEstado());
//        System.out.println("id en editar :"+Productos.idProd);
}
}
