/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.AccesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import provemax34.Entidades.Proveedor;

/**
 *
 * @author Fer
 */
public class ProveedorData {

    private Connection con = null;
    private Proveedor prov;
    public ProveedorData() {
        this.con = Conexion.getConexion();
        prov= new Proveedor();
    }

    public void guardarProveedor(Proveedor prov) {
        String query = "INSERT INTO proveedor(razonSocial,domicilio,telefono,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prov.getRazonSocial());
            ps.setString(2, prov.getDomicilio());
            ps.setString(3, prov.getTelefono());
            ps.setBoolean(4, prov.getEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                prov.setIdProveedor(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarProveedor(String RazonSocial) {
        String query = "UPDATE proveedor SET estado=0 where RazonSocial = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, RazonSocial);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarProveedor(Proveedor prov) {
        String query = "UPDATE proveedor SET razonSocial=?, domicilio=?, telefono=?, estado =?"
                + " where idProveedor=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, prov.getRazonSocial());
            ps.setString(2, prov.getDomicilio());
            ps.setString(3, prov.getTelefono());
            ps.setBoolean(4, prov.getEstado());
            ps.setInt(5, prov.getIdProveedor());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    public ArrayList<Proveedor> listarProveedores() {

        String sql = "SELECT idProveedor,razonSocial,domicilio,telefono,estado FROM proveedor WHERE estado = 1";
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prov=new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                prov.setRazonSocial(rs.getString("razonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setEstado(rs.getBoolean("estado"));
                proveedores.add(prov); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return proveedores;
    }
    public  Proveedor buscarProveedor(int id){
        String sql="SELECT razonSocial,domicilio,telefono FROM proveedor WHERE idProveedor = ? AND estado = 1";

        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                prov.setIdProveedor(id);
                prov.setRazonSocial(rs.getString("razonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el Proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Proveedor");
        }
        return prov;      
    }
}
