/* Nama File    : DosenTamu.java
 * Deskripsi    : class Tamu
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private static int bup = 65;

    public DosenTetap () {
        
    }

    public DosenTetap (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public LocalDate getBup() {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }
    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(dateFormatter));
        System.out.println("TMT : " + tmt.format(dateFormatter));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan " );
        System.out.println("BUP : " + getBup().format(dateFormatter));
        System.out.printf("Gaji Pokok : Rp %,2f%n", gajiPokok);
        System.out.printf("Tunjangan : 2%% x %d x Rp %,.2f = Rp %,.2f%n", getMasaKerja().getYears(), gajiPokok, getTunjangan());
    }
}
