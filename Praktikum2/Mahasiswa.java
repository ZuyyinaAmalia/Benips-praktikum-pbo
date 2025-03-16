/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method class Mahasiswa
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    // atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    // method
    public Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
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
    public ArrayList<MataKuliah> getArray() {
        return listMatkul;
    }

    
    public Dosen getDosenWali() {
        return dosenWali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
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
    public void setArray(ArrayList<MataKuliah> listMatkul) {
         this.listMatkul = listMatkul ;
    }
    public void setDosenWali(Dosen dosenWali) {
         this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan) {
         this.kendaraan = kendaraan;
    }

    
    public int getJumlahMatkul() {
        return listMatkul.size();
    }


    public int getJumlahSks() {
        int jumlah = 0;

        for(int i = 0; i<listMatkul.size(); i++) {
            jumlah+= listMatkul.get(i).getSks();
        }

        return jumlah;
    }

    public void addMatkul(MataKuliah m) {
        listMatkul.add(m);
    }

    public void printMhs() {
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Prodi = " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah: ");
        int i;
        for (i=0; i<listMatkul.size();i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali : " + dosenWali.getNim());
        System.out.println("Jenis Kendaraan : " + kendaraan.getJenis());
        System.out.println("No Plat : " + kendaraan.getNoPlat());
    }
    
}
