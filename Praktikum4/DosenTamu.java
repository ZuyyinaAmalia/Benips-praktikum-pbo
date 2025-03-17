/* Nama File    : DosenTamu.java
 * Deskripsi    : class DosenTamu
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(){
    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public Period getMasaaKontrakTersisa() {
        return Period.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    @Override
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(dateFormatter));
        System.out.println("TMT : " + tmt.format(dateFormatter));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan " );
        System.out.println("Masa Kontrak Tersisa : " + getMasaaKontrakTersisa().getYears() + " tahun " + getMasaaKontrakTersisa().getMonths() + "bulan");
        System.out.printf("Gaji Pokok : Rp %,2f%n", gajiPokok);
        System.out.printf("Tunjangan : 2.5%% x Rp %,.2f = Rp %,.2f%n", gajiPokok, getTunjangan());
    }

}
