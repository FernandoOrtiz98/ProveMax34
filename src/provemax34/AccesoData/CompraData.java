
package provemax34.AccesoData;
//asdasdas
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import provemax34.Entidades.Compra;
import provemax34.Entidades.Proveedor;


public class CompraData {
    
    private Connection con=null;
    private Proveedor proveedor= new Proveedor();
    private Compra compra = null;

    public CompraData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarCompra (Compra compra){                
    
        String query="INSERT INTO compra(idProveedor,fecha) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,compra.getProveedor().getIdProveedor());              
                ps.setDate(2, Date.valueOf(compra.getFecha()));               
                
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
    }
    
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
