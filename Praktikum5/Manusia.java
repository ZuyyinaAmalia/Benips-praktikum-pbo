/* Nama File    : Manusia.java
 * Deskripsi    : class Manusia
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 23 maret 2025
 */
package Praktikum5;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Manusia {
    // atribut
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    // konstruktor
    public Manusia() {};

    public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // selektor dan mutator
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public Date getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }
    public void setTglMulaiKerja(Date tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public double getPendapatan() {
        return pendapatan;
    }
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    public int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + dateFormat.format(tgl_mulai_kerja));
        System.out.println("Alamat : " +alamat);
        System.out.println("Pendapatan : " +pendapatan);
    }

    public abstract int hitungMasaKerja();
    
}
