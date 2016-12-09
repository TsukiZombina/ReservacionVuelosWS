
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marce
 */
public class ReservacionVuelos {
    private final String INSERT = "INSERT INTO tb_producto(clave, nombre, descripcion) VALUES (?, ?, ?)";
    private final String DELETE = "DELETE FROM tb_producto WHERE id_producto = ?";
    private final String UPDATE = "UPDATE tb_producto SET clave = ?, nombre = ?, descripcion = ? WHERE id_producto = ?";
    private final String GETONE = "SELECT * FROM tb_producto WHERE id_producto = ?";
    private final String GETALL = "SELECT * FROM tb_producto";
    private final String DELETEPP = "DELETE FROM tb_productoproveedor WHERE id_producto = ?";
    
    public int ingresarUsuario(String nombre, String tipo, String telefono, String correo) throws SQLException {        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost/vuelos", "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservacionVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
