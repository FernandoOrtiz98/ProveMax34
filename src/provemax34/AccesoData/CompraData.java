package provemax34.AccesoData;
//asdasdas

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemax34.Entidades.Compra;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;

public class CompraData {

    private Connection con = null;
    private Proveedor proveedor;
    private Compra compra;
    private ProveedorData proveedorD;

    public CompraData() {
        this.con = Conexion.getConexion();
        Compra compra = new Compra();
//        CompraData compraD = new CompraData();
        Proveedor provedor=new Proveedor();
        ProveedorData proveedorD=new ProveedorData();

    }

    public void guardarCompra(Compra compra) {

        String query = "INSERT INTO compra (idProveedor,fecha) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void borrarCompra(int idCompra) {
        String query = "DELETE FROM compra WHERE idCompra = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idCompra);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Compra borrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra " + ex.getMessage());
        }
    }
    
    public void modificarCompra(Compra compra) {
       String query ="UPDATE compra SET idProveedor = ?, fecha = ? WHERE idCompra = ?";
                       
        try {       
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha())); 
            ps.setInt(3, compra.getIdCompra());

             int exito= ps.executeUpdate();
                if(exito==1){
                    JOptionPane.showMessageDialog(null, "Compra modificada");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
            
        }
    }

    public List<Compra> listarComprasPorProveedor(int idProveedor) {

        List<Compra> compras = new ArrayList<>();                 //int idCompra   Proveedor proveedor   LocalDate fecha
        String sql = "SELECT * FROM compra WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            //System.out.println(" dsadsa"+idAlumno);
            while (rs.next()) {
                //Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                Proveedor proveedor = proveedorD.buscarProveedor(rs.getString("RazonSocial"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                
                compras.add(compra);
                //System.out.println("esto se va guardar en la lista inscripciones"+insc);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex.getMessage());
        }

        return compras;

    }
    public List<Producto> listarProductoPorFecha(LocalDate fecha) {

        List<Producto> productos = new ArrayList<>();                 
        String sql = "SELECT Producto.* FROM Compra JOIN DetalleCompra ON Compra.idCompra = DetalleCompra.compra JOIN Producto ON DetalleCompra.producto = Producto.idProducto WHERE Compra.fecha = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1,Date.valueOf(fecha));
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
    public  Compra buscarCompra(int id){
        String sql="SELECT idProveedor,fecha FROM compra WHERE idCompra =?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                compra=new Compra();
                proveedorD=new ProveedorData();
                compra.setIdCompra(id);
                compra.setProveedor(proveedorD.buscarProveedor(rs.getString("RazonSocial")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
            }else{
                JOptionPane.showMessageDialog(null, "no existe la Compra");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Compra");
        }
        return compra; 
    }
    public  Compra buscarCompra(LocalDate fecha){
        String sql="SELECT idCompra,idProveedor FROM compra WHERE fecha =?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDate(1,Date.valueOf(fecha));
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                compra=new Compra();
                proveedorD=new ProveedorData();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedorD.buscarProveedor(rs.getString("RazonSocial")));
                compra.setFecha(fecha);
            }else{
                JOptionPane.showMessageDialog(null, "no existe la Compra");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Compra");
        }
        return compra; 
    }
}
