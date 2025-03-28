/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method class MataKuliah
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 Februari 2025
 */

public class MataKuliah {
    // atribut
    private String idMatkul;
    private String nama;
    private int sks;

    // method
    public MataKuliah() {
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul () {
        return idMatkul;
    }

    public String getNama () {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
