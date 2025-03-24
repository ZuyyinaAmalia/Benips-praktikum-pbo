/* Nama File    : PNS.java
 * Deskripsi    : class PNS
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 23 maret 2025
 */
package Praktikum5;

import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarNameProvider;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(){};

    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNIP() {
        return nip;
    }
    public void setNIP(String nip) {
        this.nip = nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar start = Calendar.getInstance();
        start.setTime(tgl_mulai_kerja);

        int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
        int A = 8;

        return years + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override 
    public void cetakInfo() {
        System.out.println("=== Info PNS ===");
        System.out.println("NIP : " + nip);
        super.cetakInfo();
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak :" + hitungPajak());
    }

}
