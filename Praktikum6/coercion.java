/* Nama File    : coercion.java
 * Deskripsi    : class coercion
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */

package Praktikum6;

public class coercion {
    public static void main(String[] args) {
        // nomer 1
        int output1 = 'a';
        System.out.println("hasilnya: " + output1);
        
        // nomer 2 
        double x = 15.5;
        int output2 = (int)x; 
        System.out.println("hasilnya: " + output2);
        
        // nomer 3
        int y = 25;
        double output3 = y;
        System.out.println("hasilnya: " + output3);
        
        // nomer 4
        int z = 78;
        char output4 = (char) z;
        System.out.println("hasilnya: " + output4);
        
        // nomer 5
        char a = 'a';
        double output5 = a;
        System.out.println("hasilnya: " + output5);
    }
}
