
/* Nama File    : Kucing.java
 * Deskripsi    : subclass dari Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package tugas.java;

public class Kucing extends Anabul {
    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara meong");
    }
}
