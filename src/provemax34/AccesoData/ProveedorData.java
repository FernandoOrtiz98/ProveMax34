/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax34.AccesoData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import provemax34.Entidades.Proveedor;

/**
 *
 * @author Fer
 */
public class ProveedorData {

    private Connection con = null;
    private Proveedor prov = null;
    public ProveedorData() {
        this.con = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor prov) {
        String query = "INSERT INTO proveedor(razon social,domicilio,telefono) VALUES (?,?,?,?)";
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

    public void eliminarProveedor(String razonSocial) {
        String query = "UPDATE proveedor SET estado=0 where idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, razonSocial);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

//    public void modificarAlumno(Proveedor prov) {
//        String query = "UPDATE proveedor SET dni=?, apellido=?, nombre=?, fNacimiento=?"
//                + " where idAlumno=?";
//        try {
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setInt(1, prov.getDni());
//            ps.setString(2, prov.getApellido());
//            ps.setString(3, prov.getNombre());
//            ps.setDate(4, Date.valueOf(prov.getfNacimiento()));
//            ps.setInt(5, prov.getIdAlumno());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Alumno Modificado");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
//        }
//    }
}
