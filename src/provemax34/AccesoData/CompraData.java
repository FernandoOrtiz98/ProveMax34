
package provemax34.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import provemax34.Entidades.Compra;


public class CompraData {
    
    private Connection con=null;
    private ProveedorData proveedorD= new ProveedorData();
    

    public CompraData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarCompra (Compra compra, int idProveedor){                
        
        String query="INSERT INTO compra(idProveedor,fecha) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, compra.getidProveedor());               
                ps.setDate(2, Date.valueOf(compra.getfecha()));
                
                ps.executeUpdate();
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alum.setIdAlumno(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null,"Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion... "+ex.getMessage());
        }
    }
    
    
}
