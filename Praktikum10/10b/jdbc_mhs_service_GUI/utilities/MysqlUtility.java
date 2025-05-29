/* * Nama         : MysqlMahasiswaService.java
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 29 Mei 2025
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
