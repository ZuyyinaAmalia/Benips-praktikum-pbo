/*
Nama file : latihanMap.java
Deskripsi file : menampilkan key dan value dari sebuah Map
Nama saya : Zuyyina Amalia
Tanggal : 02 Juni 2025
*/
package lastpraktikum;

import java.util.HashMap;
import java.util.Map;

public class latihanMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("1", "luffy");
        mahasiswa.put("2", "zoro");
        mahasiswa.put("3", "robin");
        mahasiswa.put("4", "usopp");
        
        mahasiswa.forEach((nim, nama) -> System.out.println("NIM : " + nim + " Nama : " + nama));
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM : " + nim + " Nama : " + nama);
        });
    }
}
