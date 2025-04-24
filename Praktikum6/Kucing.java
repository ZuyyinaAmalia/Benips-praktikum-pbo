/* Nama File    : .java
 * Deskripsi    : class 
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        this.setNama(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(this.getNama() + " bergerak dengan melata");
    }
    
    @Override 
    public void bersuara() {
        System.out.println(this.getNama() + " bersuara meong");
    }
}