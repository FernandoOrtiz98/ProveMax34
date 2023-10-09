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
public class RealizarCompra extends javax.swing.JFrame {
    private Producto prod=null;
    private ProductoData prodData=new ProductoData();
    
    
    public RealizarCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        btnAgregarProd = new javax.swing.JPanel();
        txtAgregarProd = new javax.swing.JLabel();
        jcProducto = new javax.swing.JComboBox<>();
        jsCantidad = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Actual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jTDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 323, -1));

        jTPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 323, -1));

        btnAgregarProd.setBackground(new java.awt.Color(255, 255, 255));

        txtAgregarProd.setBackground(new java.awt.Color(255, 255, 255));
        txtAgregarProd.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtAgregarProd.setForeground(new java.awt.Color(0, 0, 0));
        txtAgregarProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregarProd.setText("Comprar");
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

        jPanel1.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jcProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 230, -1));
        jPanel1.add(jsCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgregarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseEntered
        btnAgregarProd.setBackground(Color.gray);
    }//GEN-LAST:event_txtAgregarProdMouseEntered

    private void txtAgregarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseExited
        btnAgregarProd.setBackground(Color.white);
    }//GEN-LAST:event_txtAgregarProdMouseExited

    private void txtAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarProdMouseClicked
//      try{
//        int id=9;
//        String nombre = jTNombre.getText();
//        String descr = jTDescripcion.getText();
//        double precio = Double.parseDouble(jTPrecio.getText());
//        int stock = Integer.parseInt(jTStock.getText());
//        
//         if(nombre.isEmpty()|| descr.isEmpty()){
//              JOptionPane.showMessageDialog(this, "No puedo haber campos vacios");
//                       return;
//           }
//           if(prod==null){
//               prod= new Producto(nombre,descr,precio,stock, true);
//               prodData.guardarProducto(prod);
//               limpiarCampos();
//           }
//      }catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this,"Datos incompatible" );
//        } catch (NullPointerException ex){
//            JOptionPane.showMessageDialog(this,"Completar datos" );
//        }

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
                new RealizarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JComboBox<String> jcProducto;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JLabel txtAgregarProd;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
        jcProducto.setSelectedIndex(-1);
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jsCantidad.setValue(0);
        
        prod=null;
    }
}
