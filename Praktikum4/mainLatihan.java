/* Nama File    : mianLatihan.java
 * Deskripsi    : class mianLatihan
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;

import java.time.LocalDate;

public class mainLatihan{
    public static void main(String[] args) {
         System.out.println("===== SISTEM INFORMASI PEGAWAI PERGURUAN TINGGI =====\n");
        
        // Tanggal saat ini adalah 16 Maret 2025 (sesuai dengan tanggal sistem)
        System.out.println("Tanggal saat ini: " + LocalDate.now().format(Pegawai.dateFormatter));
        System.out.println("\n======================================================\n");
        
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", 
            "Yanto", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000.0, 
            "Fakultas Sains dan Matematika", 
            "78647324"
        );
        
        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549", 
            "Azril", 
            LocalDate.of(1985, 8, 15), 
            LocalDate.of(2020, 6, 1), 
            4500000.0, 
            "Fakultas Teknik", 
            "DT12345", 
            LocalDate.of(2026, 5, 31)
        );
        
        // Membuat objek Tendik bidang Akademik
        Tendik tendikAkademik = new Tendik(
            "9545647550", 
            "Coki", 
            LocalDate.of(1988, 3, 20), 
            LocalDate.of(2018, 4, 1), 
            4000000.0, 
            "Akademik"
        );
        
        // Membuat objek Tendik bidang Kemahasiswaan
        Tendik tendikKemahasiswaan = new Tendik(
            "9545647551", 
            "Nina", 
            LocalDate.of(1992, 10, 10), 
            LocalDate.of(2019, 8, 1), 
            3800000.0, 
            "Kemahasiswaan"
        );
        
        // Membuat objek Tendik bidang Sumber Daya
        Tendik tendikSumberDaya = new Tendik(
            "9545647552", 
            "Zuyyina", 
            LocalDate.of(1995, 12, 25), 
            LocalDate.of(2022, 1, 1), 
            3500000.0, 
            "Sumber Daya"
        );
        
        // Menampilkan informasi masing-masing pegawai
        System.out.println("===== INFORMASI DOSEN TETAP =====");
        dosenTetap.printInfo();
        System.out.println("\n===== INFORMASI DOSEN TAMU =====");
        dosenTamu.printInfo();
        System.out.println("\n===== INFORMASI TENDIK AKADEMIK =====");
        tendikAkademik.printInfo();
        System.out.println("\n===== INFORMASI TENDIK KEMAHASISWAAN =====");
        tendikKemahasiswaan.printInfo();
        System.out.println("\n===== INFORMASI TENDIK SUMBER DAYA =====");
        tendikSumberDaya.printInfo();
    }
}
