
package provemax34.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import provemax34.AccesoData.ProveedorData;
import provemax34.Entidades.Proveedor;

/**
 *
 * @author Fer
 */
public class EditarProveedor extends javax.swing.JFrame {
    private Proveedor prov= new Proveedor();
    private ProveedorData provData=new ProveedorData();
    private Proveedores proveedores=new Proveedores();
    
    public EditarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatosProv();
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
        jLRazonSocial = new javax.swing.JLabel();
        jLDomicilio = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTRazonSocial = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JCheckBox();
        btnModificarProv = new javax.swing.JPanel();
        txtModificarProv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLRazonSocial.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLRazonSocial.setForeground(new java.awt.Color(255, 255, 255));
        jLRazonSocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRazonSocial.setText("Razon Social");
        jPanel1.add(jLRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLDomicilio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        jLDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDomicilio.setText("Domicilio");
        jPanel1.add(jLDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLTelefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTelefono.setText("Telefono");
        jPanel1.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLEstado.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEstado.setText("Estado");
        jPanel1.add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTRazonSocial.setForeground(new java.awt.Color(0, 0, 0));
        jTRazonSocial.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 324, -1));

        jTDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 323, -1));

        jTTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 323, -1));
        jPanel1.add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnModificarProv.setBackground(new java.awt.Color(255, 255, 255));

        txtModificarProv.setBackground(new java.awt.Color(255, 255, 255));
        txtModificarProv.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtModificarProv.setForeground(new java.awt.Color(0, 0, 0));
        txtModificarProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificarProv.setText("Modificar");
        txtModificarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificarProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarProvMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarProvMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnModificarProvLayout = new javax.swing.GroupLayout(btnModificarProv);
        btnModificarProv.setLayout(btnModificarProvLayout);
        btnModificarProvLayout.setHorizontalGroup(
            btnModificarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarProvLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnModificarProvLayout.setVerticalGroup(
            btnModificarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarProvLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnModificarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModificarProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProvMouseEntered
        btnModificarProv.setBackground(Color.gray);
    }//GEN-LAST:event_txtModificarProvMouseEntered

    private void txtModificarProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProvMouseExited
        btnModificarProv.setBackground(Color.white);
    }//GEN-LAST:event_txtModificarProvMouseExited

    private void txtModificarProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarProvMouseClicked

        try {
            prov.setRazonSocial(jTRazonSocial.getText());
            prov.setDomicilio(jTDomicilio.getText());
            prov.setTelefono(jTTelefono.getText());
            prov.setEstado(true);
            provData.modificarProveedor(prov);
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatible");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Completar datos");
        }
        
    }//GEN-LAST:event_txtModificarProvMouseClicked

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
                new EditarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnModificarProv;
    private javax.swing.JCheckBox jCBEstado;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLRazonSocial;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTRazonSocial;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JLabel txtModificarProv;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
        jTRazonSocial.setText("");
        jTDomicilio.setText("");
        jTTelefono.setText("");
        jCBEstado.setEnabled(false);
        prov=null;
    }
public void cargarDatosProv(){
    prov = provData.buscarProveedor(Proveedores.idProv);
    jTRazonSocial.setText(prov.getRazonSocial());
    jTDomicilio.setText(prov.getDomicilio());
    jTTelefono.setText(prov.getTelefono());
    jCBEstado.setSelected(true);
}

}
