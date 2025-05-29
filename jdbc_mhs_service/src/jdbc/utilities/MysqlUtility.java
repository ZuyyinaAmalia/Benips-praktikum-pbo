/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Fauzi Amrullah
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null ) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3307/pbo";
                String user = "root";
                String password = "12345678";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException one){
                System.out.println("gagal load driver : " + one.getMessage());    
            } catch (SQLException sqle) {
                System.out.println("gagal koneksi : " + sqle.getMessage());
            }
        }
      return koneksi;
    }
}
