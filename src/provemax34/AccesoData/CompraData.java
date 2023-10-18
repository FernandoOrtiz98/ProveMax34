package provemax34.AccesoData;
//asdasdas

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
import provemax34.Entidades.Proveedor;

public class CompraData {

    private Connection con = null;
    private Proveedor proveedor = new Proveedor();
    private Compra compra = null;
    ProveedorData proveedorD = new ProveedorData();

    public CompraData() {
        this.con = Conexion.getConexion();
        Compra compra = new Compra();
        CompraData compraD = new CompraData();

    }

    public void guardarCompra(Compra compra) {

        String query = "INSERT INTO compra(idProveedor,fecha) VALUES (?,?)";
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
    
    public static void modificarCompra(Compra compra) {
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
    
    
    
    
    
    

//    public List<Compra> listarComprasPorProveedor(int idProveedor) {
//
//        List<Compra> compras = new ArrayList<>();                 //int idCompra   Proveedor proveedor   LocalDate fecha
//        String sql = "SELECT * FROM compra WHERE idProveedor = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idProveedor);
//            ResultSet rs = ps.executeQuery();
//            //System.out.println(" dsadsa"+idAlumno);
//            while (rs.next()) {
//                //Compra compra = new Compra();
//                compra.setIdCompra(rs.getInt("idCompra"));
//                Proveedor proveedor = proveedorD.buscarProveedor(rs.getInt("idProveedor"));
//                compra.setFecha(rs.getDate("fecha").toLocalDate());
//                
//                compras.add(compra);
//                //System.out.println("esto se va guardar en la lista inscripciones"+insc);
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex.getMessage());
//        }
//
//        return compras;
//
//    }
    
    
    /*public void guardarCompra (int idProveedor, LocalDate fecha){                
    
        String query="INSERT INTO compra(idProveedor,fecha) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,idProveedor );               //compra.getProveedor().getIdProveedor()
                ps.setDate(2, Date.valueOf(fecha));  //compra.getFecha()
                
                ps.executeUpdate();
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                compra.setIdCompra(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null,"Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }*/

}
