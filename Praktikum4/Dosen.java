/* Nama File    : Dosen.java
 * Deskripsi    : class dosen
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */


package Praktikum4;

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(){

    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }
}
