/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lastpraktikum;
/*
Nama file : lambdaList.java
Deskripsi file : Ekspresi Lambda pada Collection
Nama saya : Zuyyina Amalia
Tanggal : 02 Juni 2025
*/
import java.util.ArrayList;

public class lambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("adi");
        mahasiswaList.add("Bambank");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
//        lambda digunakan sebagai parameter 
    mahasiswaList.forEach((nama)->System.out.println(nama));
    }
}
