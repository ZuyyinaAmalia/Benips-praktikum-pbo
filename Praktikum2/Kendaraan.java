/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method class Kendaraan
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 Februari 2025
 */

public class Kendaraan {
    // atribut
    private String noPlat;
    private String jenis;


    // method
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}