/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg9;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Fauzi Amrullah
 */
public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo","root","12345678");
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        java.sql.Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }

}
