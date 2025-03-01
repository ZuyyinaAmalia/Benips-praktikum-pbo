package Praktikum2;

public class Dosen {
    // atribut
    private String nim;
    private String nama;
    private String prodi;
    
    // method
    public Dosen() {
        nim = "";
        nama = "";
        prodi = "";
    }
    public Dosen(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
}
