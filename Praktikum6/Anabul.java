/* Nama File    : Anabul.java
 * Deskripsi    : class Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */
public class Anabul {
    private String nama;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void gerak() {
        System.out.println(nama + "bergerak");
    }
    
    public void bersuara() {
        System.out.println(nama + "bersuara");
    }
}