/* Nama File    : Pengusaha.java
 * Deskripsi    : class Pengusaha
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 23 maret 2025
 */
package Praktikum5;

import java.util.Calendar;
import java.util.Date;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha= 0;

    public Pengusaha(){};

    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNPWP() {
        return npwp;
    }
    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar start = Calendar.getInstance();
        start.setTime(tgl_mulai_kerja);

        int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
        int B = 1;

        return years + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override 
    public void cetakInfo() {
        System.out.println("=== Info Pengusaha ===");
        System.out.println("NPWP : " + npwp);
        super.cetakInfo();
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak :" + hitungPajak());
    }
}
