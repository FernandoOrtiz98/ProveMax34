
package provemax34.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import provemax34.Entidades.Compra;
import provemax34.Entidades.DetalleCompra;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;





public class DetalleCompraData {
    private Connection con = null;
    private Compra comp = new Compra();
    private Producto prod;
    private DetalleCompra dComp= new DetalleCompra();;

    public DetalleCompraData() {
        this.con= Conexion.getConexion();
        prod= new Producto();
    }
    
    public void guardarDetalleCompra(DetalleCompra dc) {
        String query = "INSERT INTO detalleCompra(idDetalle,cantidad,precioCosto,compra,producto) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getIdDetalle());
            ps.setInt(2, dc.getCantidad());
            ps.setDouble(3, dc.getPrecioCosto());
            ps.setInt(4, dc.getCompra().getIdCompra());
            ps.setInt(5, dc.getProducto().getIdProducto());
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
}
