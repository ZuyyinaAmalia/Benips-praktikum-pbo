/* Nama File    : Anabul.java
 * Deskripsi    : class abstract Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package tugas.java;

public abstract class Anabul {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public abstract void gerak();
    public abstract void bersuara();
}
