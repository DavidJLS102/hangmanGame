/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HangedGame.UI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author WINDOWS
 */
public class DatabaseControler {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hanged_game"; 
        String usuario = "root"; 
        String contraseña = "123456789090"; 

        Connection conexion = null;
        Statement declaracion = null;
        ResultSet resultados = null;

        try {
            // Registrar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa!");

            // Crear una declaración para ejecutar consultas SQL
            declaracion = conexion.createStatement();

            // Escribir y ejecutar la consulta SQL
            String consultaSQL = "SELECT * FROM words"; 
            resultados = declaracion.executeQuery(consultaSQL);

            // Obtener y mostrar los metadatos de los resultados
            int columnas = resultados.getMetaData().getColumnCount();

            // Mostrar los nombres de las columnas
            for (int i = 1; i <= columnas; i++) {
                System.out.print(resultados.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();

            // Recorrer los resultados y mostrarlos
            while (resultados.next()) {
                for (int i = 1; i <= columnas; i++) {
                    System.out.print(resultados.getString(i) + "\t");
                }
                System.out.println();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos o al ejecutar la consulta: " + e.getMessage());
        } finally {
           
            try {
                if (resultados != null) resultados.close();
                if (declaracion != null) declaracion.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
