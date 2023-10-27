/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.Vistas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import provemax34.AccesoData.CompraData;
import provemax34.AccesoData.DetalleCompraData;
import provemax34.AccesoData.ProductoData;
import provemax34.AccesoData.ProveedorData;
import provemax34.Entidades.Compra;
import provemax34.Entidades.DetalleCompra;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;

/**
 *
 * @author Fer
 */
public class DetallesDeCompras extends javax.swing.JInternalFrame {
    private ArrayList<Proveedor> listaProv;
    private ArrayList<DetalleCompra> listaDetalle;
    private ArrayList<Compra> listaCompra;
    private Producto prod = null;
    private ProductoData prodData;
    private CompraData compData;
    private Proveedor prov;
    private ProveedorData provData = new ProveedorData();
    private DetalleCompra dc = new DetalleCompra();
    private DetalleCompraData dcd;
    public static int idProd;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public DetallesDeCompras() {
        prodData = new ProductoData();
        prov= new Proveedor();
        prod = new Producto();
        compData=new CompraData();
        dcd= new DetalleCompraData();
        
        initComponents();
        armarCabecera();
        cargaDatosDetalles();
//        cargarComboBoxprov();
//        cargarComboBoxcomp();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        background1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTBuscador = new javax.swing.JTextField();
        txtFiltrar = new javax.swing.JLabel();
        panelFiltros = new javax.swing.JPanel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jcbCompra = new javax.swing.JComboBox<>();
        jcbStock = new javax.swing.JComboBox<>();
        jdFecha1 = new com.toedter.calendar.JDateChooser();
        jdFecha2 = new com.toedter.calendar.JDateChooser();
        jdFechaEspecifica = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCompras = new javax.swing.JTable();
        PanelSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();

        background1.setForeground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        background1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 200));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PROVEEDORES");

        jTextField2.setBackground(new java.awt.Color(60, 63, 65));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Buscar proveedor..");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        background1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SALIR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 40));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDITAR");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 40));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("AGREGAR");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 40));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(780, 400));

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 150, -1));

        jTBuscador.setBackground(new java.awt.Color(60, 63, 65));
        jTBuscador.setForeground(new java.awt.Color(255, 255, 255));
        jTBuscador.setText("Buscar Detalle...");
        jTBuscador.setBorder(null);
        jTBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBuscadorMouseClicked(evt);
            }
        });
        jTBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorActionPerformed(evt);
            }
        });
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });
        jPanel1.add(jTBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 250, -1));

        txtFiltrar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFiltrar.setText("Filtrar por...");
        txtFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFiltrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFiltrarMouseExited(evt);
            }
        });
        jPanel1.add(txtFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 140, 30));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        panelFiltros.setBackground(new java.awt.Color(0, 0, 0));

        jcbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbProveedorMouseClicked(evt);
            }
        });
        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proveedor");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compra");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock min");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enftre fechas");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fechas esp");

        javax.swing.GroupLayout panelFiltrosLayout = new javax.swing.GroupLayout(panelFiltros);
        panelFiltros.setLayout(panelFiltrosLayout);
        panelFiltrosLayout.setHorizontalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jdFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbProveedor, 0, 151, Short.MAX_VALUE)
                            .addComponent(jcbCompra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbStock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jdFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdFechaEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        panelFiltrosLayout.setVerticalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jdFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jdFechaEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        background.add(panelFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 240, 300));

        jtCompras.setBackground(new java.awt.Color(255, 255, 255));
        jtCompras.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jtCompras.setForeground(new java.awt.Color(0, 0, 0));
        jtCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCompras.setOpaque(false);
        jScrollPane1.setViewportView(jtCompras);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 540, 200));

        PanelSalir.setBackground(new java.awt.Color(0, 0, 0));
        PanelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSalir.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalir.setText("SALIR");
        txtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSalirMouseExited(evt);
            }
        });
        PanelSalir.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        background.add(PanelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 40));

        panelEliminar.setBackground(new java.awt.Color(0, 0, 0));

        txtEliminar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 356, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorActionPerformed

    }//GEN-LAST:event_jTBuscadorActionPerformed

    private void txtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseClicked
        if(jtCompras.getSelectedRow()>=0){
            idProd = (Integer) jtCompras.getValueAt(jtCompras.getSelectedRow(), 0);
            prodData.eliminarProducto(idProd);
        }else{
            JOptionPane.showMessageDialog(this,"Selecciona el producto a eliminar...");
        }  
    }//GEN-LAST:event_txtEliminarMouseClicked

    private void txtEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseEntered
        panelEliminar.setBackground(Color.gray);
    }//GEN-LAST:event_txtEliminarMouseEntered

    private void txtEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseExited
        panelEliminar.setBackground(Color.black);
    }//GEN-LAST:event_txtEliminarMouseExited

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        dispose();
    }//GEN-LAST:event_txtSalirMouseClicked

    private void txtSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseEntered
        PanelSalir.setBackground(Color.gray);
    }//GEN-LAST:event_txtSalirMouseEntered

    private void txtSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseExited
        PanelSalir.setBackground(Color.black);
    }//GEN-LAST:event_txtSalirMouseExited

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        borrarFilas();
        try {
            for(DetalleCompra i:listaDetalle){
            if(i.getProducto().getNombreProducto().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())){
                modelo.addRow(new Object[]{i.getIdDetalle(),i.getCantidad(),i.getPrecioCosto(),i.getCompra().getIdCompra(),i.getProducto().getNombreProducto()});
            }
        }
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No se encontro el Detalle "+ex.getMessage());
        }
        
    }//GEN-LAST:event_jTBuscadorKeyReleased

    private void jTBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBuscadorMouseClicked
        jTBuscador.setText("");
    }//GEN-LAST:event_jTBuscadorMouseClicked

    private void txtFiltrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltrarMouseEntered
        
    }//GEN-LAST:event_txtFiltrarMouseEntered

    private void txtFiltrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltrarMouseExited
        
    }//GEN-LAST:event_txtFiltrarMouseExited

    private void txtFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltrarMouseClicked
    
    }//GEN-LAST:event_txtFiltrarMouseClicked

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
        borrarFilas();
        try {
            System.out.println("hola");
            prov=new Proveedor();
            prov=(Proveedor) jcbProveedor.getSelectedItem();
            JOptionPane.showMessageDialog(this, "idprov "+prov.getIdProveedor());
            System.out.println("lista"+listaCompra);
            for (Compra c : compData.listarComprasPorProveedor(prov.getIdProveedor())) {
                JOptionPane.showMessageDialog(this, "id "+c.getIdCompra());
                int idComp=c.getIdCompra();
                System.out.println("id"+idComp);
                listaDetalle=dcd.listarDetallesPorCompra(c.getIdCompra());
                for (DetalleCompra i : listaDetalle) {
            modelo.addRow(new Object[]{i.getIdDetalle(),i.getCantidad(),i.getPrecioCosto(),i.getCompra().getIdCompra(),i.getProducto().getNombreProducto(),i.getCompra().getFecha()});
            }
            
        }
        
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No se encontro el Detalle "+ex.getMessage());
        }
        
    }//GEN-LAST:event_jcbProveedorActionPerformed

    private void jcbProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbProveedorMouseClicked
        jcbProveedor.removeAllItems();
        cargarComboBoxprov();
//        jcbProveedor.setSelectedIndex(-1);
    }//GEN-LAST:event_jcbProveedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSalir;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JComboBox<Compra> jcbCompra;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private javax.swing.JComboBox<Producto> jcbStock;
    private com.toedter.calendar.JDateChooser jdFecha1;
    private com.toedter.calendar.JDateChooser jdFecha2;
    private com.toedter.calendar.JDateChooser jdFechaEspecifica;
    private javax.swing.JTable jtCompras;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtFiltrar;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Cantidad");
        filaCabecera.add("Precio Costo");
        filaCabecera.add("Compra");
        filaCabecera.add("Producto");
        filaCabecera.add("Fecha");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtCompras.setModel(modelo);

    }

    private void cargaDatosDetalles() {
        listaDetalle = dcd.listarDetalles();
        for (DetalleCompra i : listaDetalle) {
            modelo.addRow(new Object[]{i.getIdDetalle(),i.getCantidad(),i.getPrecioCosto(),i.getCompra().getIdCompra(),i.getProducto().getNombreProducto(),i.getCompra().getFecha()});
        }
    }
    private void cargaDatosPorProveedor(Proveedor prov) {
        listaCompra = compData.listarComprasPorProveedor(prov.getIdProveedor());
        for (DetalleCompra i : listaDetalle) {
            modelo.addRow(new Object[]{i.getIdDetalle(),i.getCantidad(),i.getPrecioCosto(),i.getCompra().getIdCompra(),i.getProducto().getNombreProducto(),i.getCompra().getFecha()});
        }
    }
    private void borrarFilas(){
        int f = jtCompras.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
    public void jPanelYArriba(final int start, final int stop, final int delay, final int increment, final JPanel jPabel)
  {
    if (jPabel.getY() == start) {
      new Thread()
      {
        public void run()
        {
          while (jPabel.getY() > stop) {
            for (int i = start; i >= stop; i -= increment) {
              try
              {
                Thread.sleep(delay);
                jPabel.setLocation(jPabel.getX(), i);
              }
              catch (InterruptedException e)
              {
                System.out.println("Error Thread Interrupted: " + e);
              }
            }
          }
          jPabel.setLocation(jPabel.getX(), stop);
        }
      }.start();
    }
  }
  
  public void jPanelYAbajo(final int start, final int stop, final int delay, final int increment, final JPanel jPanel)
  {
    if (jPanel.getY() == start) {
      new Thread()
      {
        public void run()
        {
          while (jPanel.getY() <= start) {
            for (int i = start; i <= stop; i += increment) {
              try
              {
                Thread.sleep(delay);
                
                jPanel.setLocation(jPanel.getX(), i);
              }
              catch (InterruptedException e)
              {
                System.out.println("Error Thread Interrupted: " + e);
              }
            }
          }
          jPanel.setLocation(jPanel.getX(), stop);
        }
      }.start();
    }
  }
  private void cargarComboBoxprov() {
        listaProv = provData.listarProveedores();
        for (Proveedor item : listaProv) {
            jcbProveedor.addItem(item);
        }

    }
  private void cargarComboBoxcomp() {
        listaCompra = compData.listarCompras();
        for (Compra item : listaCompra) {
            jcbCompra.addItem(item);
        }

    }
}
