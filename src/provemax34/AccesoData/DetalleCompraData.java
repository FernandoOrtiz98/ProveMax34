
package provemax34.AccesoData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemax34.Entidades.Compra;
import provemax34.Entidades.DetalleCompra;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;





public class DetalleCompraData {
    private Connection con = null;
    private Compra comp;
    private CompraData compD;
    private Producto prod;
    private ProductoData prodD;
    private DetalleCompra dComp;

    public DetalleCompraData() {
        this.con= Conexion.getConexion();
        prod= new Producto();
        comp=new Compra();
        compD=new CompraData();
        dComp=new DetalleCompra();
        prodD=new ProductoData();
    }
    
    public void guardarDetalleCompra(DetalleCompra dc) {
        String query = "INSERT INTO detalleCompra(cantidad,precioCosto,idCompra,idProducto) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dc.setIdDetalle(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarDetalleCompra(DetalleCompra dc) {
        String query = "UPDATE detalleCompra SET cantidad=? ,precioCosto=? ,compra=? ,producto=? "
                + " where idDetalle=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            ps.setInt(5, dc.getIdDetalle());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Detalle Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
            public void borrarDetalleCompra(int idDetalle){
        String query = "DELETE FROM detalleCompra WHERE idDetalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idDetalle);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Detalle borrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle " + ex.getMessage());
        }
    }
    public ArrayList<Producto> listarProductosPorFecha(LocalDate fecha) {
        
        String sql = "SELECT idProducto,nombreProducto,descripcion,precioActual,stock,estado FROM producto WHERE estado = 1";
        ArrayList<Producto> productos = new ArrayList<>();
        //if()
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto prod=new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                productos.add(prod); //Por cada vuelta del while, agregamos un alumno al ArrayList productos.
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return productos;
    }
    public List<Producto> listarProductoPorCompra(int idCompra) {

        List<Producto> productos = new ArrayList<>();                 
        String sql = "SELECT Producto.* " +
        " FROM DetalleCompra " +
        " JOIN Producto ON DetalleCompra.producto = Producto.idProducto " +
        " WHERE DetalleCompra.compra = ?; ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCompra);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto prod=new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);
                
                productos.add(prod);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex.getMessage());
        }
        return productos;
    }
    public ArrayList<DetalleCompra> listarDetalles() {

        String sql = "SELECT * FROM detalleCompra ";
        ArrayList<DetalleCompra> Detalles = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleCompra dc= new DetalleCompra();
                prodD=new ProductoData();
                dc.setIdDetalle(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioCosto(rs.getDouble("precioCosto"));
                dc.setCompra(compD.buscarCompra(rs.getInt("idCompra")));
                dc.setProducto(prodD.buscarProducto(rs.getInt("idProducto")));
                Detalles.add(dc); //Por cada vuelta del while, agregamos un alumno al ArrayList productos.
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return Detalles;
    }
}
