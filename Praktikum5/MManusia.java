/**
 * File: MManusia.java
 * Description: Main class
 * Pembuat : Zuyyina Amalia 
 * Tanggal : 23 Maret 2025
 */
package Praktikum5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MManusia {
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            // Create objects based on the provided main program
            PNS p1 = new PNS("Satriyo", dateFormat.parse("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
            Pengusaha pe1 = new Pengusaha("Adhy", dateFormat.parse("01-01-2000"), "Jl.Air", 55000000, "000-556-773-212-000-5");
            Petani pt1 = new Petani("Nugraha", dateFormat.parse("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
            PNS p2 = new PNS("Panji", dateFormat.parse("01-04-2010"), "Pekalongan",1000000, "19800421201004102");
            p2.setAlamat("Jl. Panorama 111 Tembalang");
            // Manusia manusia = new Manusia();
            // // Print counters
            // System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
            System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
            System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
            System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
            
            // Calculate and print tax
            System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
            System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
            System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
            
            // Calculate and print work years
            System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
            System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
            System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
            
            // Print detailed information
            p1.cetakInfo();
            pe1.cetakInfo();
            pt1.cetakInfo();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
