/* Nama File    : Tendik.java
 * Deskripsi    : class Tendik
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */


package Praktikum4;

import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;
    private static int bup = 55;

    public Tendik(){}

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getBup() {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    @Override 
    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(dateFormatter));
        System.out.println("TMT : " + tmt.format(dateFormatter));
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan " );
        System.out.println("BUP : " + getBup().format(dateFormatter));
        System.out.printf("Gaji Pokok : Rp %,2f%n", gajiPokok);
        System.out.printf("Tunjangan : 1%% x %d x Rp %,.2f = Rp %,.2f%n", getMasaKerja().getYears(), gajiPokok, getTunjangan() );
    }
}
