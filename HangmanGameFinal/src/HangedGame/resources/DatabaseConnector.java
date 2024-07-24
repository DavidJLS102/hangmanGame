/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HangedGame.resources;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author WINDOWS
 */
public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/hanged_game"; 
    private static final String USER = "root";
    private static final String PASSWORD = "123456789090"; 

    public ArrayList<String> getWords() {
        ArrayList<String> wordList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT word FROM words")) {

            while (resultSet.next()) {
                wordList.add(resultSet.getString("word"));
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos o al ejecutar la consulta: " + e.getMessage());
        }

        return wordList;
    }
}
    

