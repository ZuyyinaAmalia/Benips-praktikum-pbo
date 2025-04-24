/* Nama File    : Burung.java
 * Deskripsi    : class Burung
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        this.setNama(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak dengan terbang");
    }
    
    @Override 
    public void bersuara() {
        System.out.println(this.getNama() + " bersuara cuit");
    }
}