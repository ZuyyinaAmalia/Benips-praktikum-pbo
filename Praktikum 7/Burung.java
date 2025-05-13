/* Nama File    : Burung.java
 * Deskripsi    : subclass dari Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package Praktikum7;
public class Burung extends Anabul {
    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara cuit");
    }
}
