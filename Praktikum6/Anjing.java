/* Nama File    : Anjing.java
 * Deskripsi    : class Anjing
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        this.setNama(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak dengan melata");
    }
    
    @Override 
    public void bersuara() {
        System.out.println(this.getNama() + " bersuara guk-guk");
    }
}