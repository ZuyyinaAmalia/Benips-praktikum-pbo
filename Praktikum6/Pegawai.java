/* Nama File    : Pegawai.java
 * Deskripsi    : class Pegawai
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;
    
    public String getNama() {
        return nama;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama );
        System.out.println("Gaji pokok : " + gajiPokok);
        
    }
}