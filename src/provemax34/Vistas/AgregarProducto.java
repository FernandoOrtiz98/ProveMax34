/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.Vistas;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import provemax34.AccesoData.ProductoData;
import provemax34.AccesoData.ProveedorData;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;


public class AgregarProducto extends javax.swing.JFrame {
    private ArrayList <Proveedor>listaProv;
    private ArrayList <Producto>listaProd;
    private Producto prod=null;
    private ProductoData prodData=new ProductoData();
    private ProveedorData provData= new ProveedorData();
    private Proveedor prov;
    private boolean disp=false;
    
    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        prov=null;
        provData=new ProveedorData();
        prov = new Proveedor();
        prod = new Producto();
        prodData = new ProductoData();
        cargarComboBox();
        cargarComboBoxProducto();
        jcbIdProductos.setSelectedIndex(-1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelInicio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnContinuar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        PanelSecundario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecioCosto = new javax.swing.JTextField();
        jTCantidad = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JCheckBox();
        btnAgregarProd = new javax.swing.JPanel();
        txtAgregarProd = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPrecioCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLBuscador = new javax.swing.JLabel();
        jcbIdProductos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Seleccionar Proveedor");

        jcbProveedor.setBackground(new java.awt.Color(0, 0, 0));
        jcbProveedor.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        btnContinuar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContinuar.setText("Continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Seleccionar Fecha");

        jDateChooser2.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioLayout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1.add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, 0, 400, 470));

        PanelSecundario.setBackground(new java.awt.Color(0, 0, 0));
        PanelSecundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion");
        PanelSecundario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 159, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Costo");
        PanelSecundario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 229, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado");
        PanelSecundario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 409, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad");
        PanelSecundario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 329, -1, -1));

        jTDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 189, 323, -1));

        jTPrecioCosto.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 269, 100, -1));

        jTCantidad.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 359, 100, -1));
        PanelSecundario.add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 409, -1, -1));

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

        PanelSecundario.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 389, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio Actual");
        PanelSecundario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 229, -1, -1));

        jTPrecioCliente.setForeground(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTPrecioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 269, 100, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        PanelSecundario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 89, -1, -1));

        jTNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        PanelSecundario.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 119, 324, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLBuscador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provemax34/Imagenes/8666693_search_icon.png"))); // NOI18N
        jLBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelSecundario.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 29, -1, -1));

        jcbIdProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIdProductosActionPerformed(evt);
            }
        });
        PanelSecundario.add(jcbIdProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, -1));

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
        jPanelXDerecha(-400, 0, 10, 10, PanelInicio);
        jPanelXDerecha(0, 400, 10, 10, PanelSecundario);

        try{
        String nombre = jTNombre.getText();
        String descr = jTDescripcion.getText();
        double precioCl = Double.parseDouble(jTPrecioCliente.getText());
        double precioCt = Double.parseDouble(jTPrecioCosto.getText());
        int cantidad = Integer.parseInt(jTCantidad.getText());
              
         if(disp==true){
              prod=(Producto) jcbIdProductos.getSelectedItem();
              prod.setPrecioActual(precioCl);
              prod.setStock(prod.getStock()+Integer.parseInt(jTCantidad.getText()));
              prodData.modificarProducto(prod);
              prod=null;
               limpiarCampos();
               disp=false;
                       return;
           }
          if(nombre.isEmpty()|| descr.isEmpty()|| precioCl<=0||precioCt>precioCl || cantidad<=0 ){
              JOptionPane.showMessageDialog(this, "Error al llenar el formulario, verificar campos...");
                       return;
           } else{
               prod= new Producto(nombre,descr,precioCl,cantidad, true);
               prodData.guardarProducto(prod);
               prod=null;
               limpiarCampos();
               disp=false;
               
          }
      }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Datos incompatible" );
            limpiarCampos();
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this,"Completar datos" );
        }

    }//GEN-LAST:event_txtAgregarProdMouseClicked

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
        
        jPanelXIzquierda(0, -400, 10, 10, PanelInicio);
        jPanelXIzquierda(400, 0, 10, 10, PanelSecundario);
        
    }//GEN-LAST:event_btnContinuarMouseClicked

    private void jLBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscadorMouseClicked
//        disp=false;
//        prod=null;
//        try {
//            prod=prodData.buscarProducto();
//        jTNombre.setText(prod.getNombreProducto());
//        jTDescripcion.setText(prod.getDescripcion());
//        jTPrecioCliente.setText(prod.getPrecioActual()+"");
//        jCBEstado.setSelected(true);
//        if(prod!=null){
//            disp=true;
//        }
//
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Datos incompatibles");
//
//        } catch (NullPointerException nu){
//            JOptionPane.showMessageDialog(this, "No se encontro el Producto");
//
//        }
    }//GEN-LAST:event_jLBuscadorMouseClicked

    private void jcbIdProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIdProductosActionPerformed
//        jcbIdProductos.setSelectedIndex(-1);
        prod=(Producto) jcbIdProductos.getSelectedItem();
        jTNombre.setText(prod.getNombreProducto());
        jTDescripcion.setText(prod.getDescripcion());
        jTPrecioCliente.setText(prod.getPrecioActual()+"");
        jCBEstado.setSelected(true);
        disp=true;
    }//GEN-LAST:event_jcbIdProductosActionPerformed


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
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelSecundario;
    private javax.swing.JPanel btnAgregarProd;
    private javax.swing.JLabel btnContinuar;
    private javax.swing.JCheckBox jCBEstado;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLBuscador;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecioCliente;
    private javax.swing.JTextField jTPrecioCosto;
    private javax.swing.JComboBox<Producto> jcbIdProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private javax.swing.JLabel txtAgregarProd;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
       
        jTNombre.setText("");
        jTDescripcion.setText("");
        jTPrecioCliente.setText("");
        jTPrecioCosto.setText("");
        jTCantidad.setText("");
        jCBEstado.setEnabled(false);
        prod=null;
    }
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
private void cargarComboBox() {
    listaProv = provData.listarProveedores();
        for (Proveedor item : listaProv) {
            jcbProveedor.addItem(item);
        }

    }
private void cargarComboBoxProducto() {
    listaProd = prodData.listarProductos();
        for (Producto item : listaProd) {
            jcbIdProductos.addItem(item);
        }

    }
  
}
