/* Nama File    : Pegawai.java
 * Deskripsi    : class Pegawai
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    // attribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    protected static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));


    public Pegawai() {
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setgajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public double getTunjangan() {
        return getMasaKerja().getYears() * gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(dateFormatter));
        System.out.println("TMT : " + tmt.format(dateFormatter));

        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan " );

        System.out.printf("Gaji Pokok : Rp %,2f%n", gajiPokok);
    }
}
