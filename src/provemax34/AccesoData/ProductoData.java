package provemax34.AccesoData;
//hola

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
import provemax34.Entidades.Producto;

/**
 *
 * @author Fer
 */
public class ProductoData {

    private Connection con = null;
    private Producto prod;

    public ProductoData() {
        this.con = Conexion.getConexion();
        prod = new Producto();
    }

    public void guardarProducto(Producto prod) {
        String query = "INSERT INTO producto(nombreProducto,descripcion,precioActual,stock,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prod.getNombreProducto());
            ps.setString(2, prod.getDescripcion());
            ps.setDouble(3, prod.getPrecioActual());
            ps.setInt(4, prod.getStock());
            ps.setBoolean(5, prod.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                prod.setIdProducto(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarProducto(Producto prod) {
        String query = "UPDATE producto SET nombreProducto=?, descripcion=?, precioActual=?, stock=?"
                + " where idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, prod.getNombreProducto());
            ps.setString(2, prod.getDescripcion());
            ps.setDouble(3, prod.getPrecioActual());
            ps.setInt(4, prod.getStock());
            ps.setInt(5, prod.getIdProducto());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarProducto(int id) {
        String query = "UPDATE producto SET estado=0 where idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

//     public  Producto buscarProducto(String nombre,String descripcion){
//        String sql="SELECT nombreProducto,descripcion,precioActual,stock,estado FROM producto WHERE nombreProducto =? AND descripcion = ?";
//        try {
//            PreparedStatement ps= con.prepareStatement(sql);
//            ps.setString(1, nombre);
//            ps.setString(2, descripcion);
//            ResultSet rs=ps.executeQuery();
//            if(rs.next()){
//                //prod= new Producto();
//                prod.setIdProducto(rs.getInt("idProducto"));
//                prod.setNombreProducto(rs.getString("nombreProducto"));
//                prod.setDescripcion(rs.getString("descripcion"));
//                prod.setPrecioActual(rs.getDouble("precioActual"));
//                prod.setStock(rs.getInt("stock"));
//                prod.setEstado(true);
//            
//            }else{
//                JOptionPane.showMessageDialog(null, "no existe el Producto");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Producto");
//        }
//        return prod;      
//    }
    public Producto buscarProducto(int id) {
        String sql = "SELECT nombreProducto,descripcion,precioActual,stock,estado FROM producto WHERE idProducto=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prod = new Producto();
                prod.setIdProducto(id);
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe el Producto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return prod;
    }

    public ArrayList<Producto> listarProductos() {

        String sql = "SELECT idProducto,nombreProducto,descripcion,precioActual,stock,estado FROM producto WHERE estado = 1";
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto prod = new Producto();
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

    public ArrayList<Producto> listarProductosPorStockMin() {

        String sql = "SELECT * FROM Producto WHERE stock < 6;";
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                productos.add(prod);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return productos;
    }

//    public List<Producto> listarProductosMasComprados(LocalDate fechaInicio, LocalDate fechaFin) {
//        String sql = "SELECT p.idProducto, p.nombreProducto, p.descripcion, p.precioActual, p.stock, p.estado, SUM(d.cantidad) AS totalComprado FROM Producto p, DetalleCompra d, Compra c WHERE c.fecha BETWEEN ? AND ? AND c.idCompra = d.idCompra AND d.idProducto = p.idProducto GROUP BY p.idProducto ORDER BY totalComprado DESC";
//        List<Producto> productos = new ArrayList<>();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setDate(1, Date.valueOf(fechaInicio));
//            ps.setDate(2, Date.valueOf(fechaFin));
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Producto producto;
//                producto = new Producto(rs.getInt("idProducto"), rs.getString("nombreProducto"), rs.getString("descripcion"), rs.getDouble("precioActual"), rs.getInt("stock"), rs.getBoolean("estado"));
//                productos.add(producto);
//            }
//        ps.close();
//    } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
//        }catch (NullPointerException ex){
//        JOptionPane.showMessageDialog(null, "no se encontro el Producto");
//    }
//        return productos;
//    }
  public List<Producto> listarProductosMasComprados(LocalDate fechaInicio, LocalDate fechaFin) {
    String sql = "SELECT p.idProducto, p.nombreProducto, p.descripcion, p.precioActual, p.stock, p.estado, SUM(d.cantidad) AS totalComprado " +
                 "FROM Producto p, DetalleCompra d, Compra c " +
                 "WHERE c.fecha BETWEEN ? AND ? AND c.idCompra = d.idCompra AND d.idProducto = p.idProducto " +
                 "GROUP BY p.idProducto ORDER BY totalComprado DESC";

    List<Producto> productos = new ArrayList<>();

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setDate(1, Date.valueOf(fechaInicio));
        ps.setDate(2, Date.valueOf(fechaFin));

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombreProducto"),
                        rs.getString("descripcion"),
                        rs.getDouble("precioActual"),
                        rs.getInt("stock"),
                        rs.getBoolean("estado")
                );
                productos.add(producto);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
    } catch (NullPointerException ex) {
        JOptionPane.showMessageDialog(null, "No se encontró el Producto");
    }

    return productos;
}

}
