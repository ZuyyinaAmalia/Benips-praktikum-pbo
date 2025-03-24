/* Nama File    : Petani.java
 * Deskripsi    : class Petani
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 23 maret 2025
 */
package Praktikum5;

import java.util.Calendar;
import java.util.Date;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani= 0;

    public Petani(){};

    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar start = Calendar.getInstance();
        start.setTime(tgl_mulai_kerja);

        int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
        int C = 0;

        return years + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override 
    public void cetakInfo() {
        System.out.println("=== Info Petani ===");
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak :" + hitungPajak());
    }
}
