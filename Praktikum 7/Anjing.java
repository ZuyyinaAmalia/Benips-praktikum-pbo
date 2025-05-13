/* Nama File    : Anjing.java
 * Deskripsi    : subclass dari Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package Praktikum7;
public class Anjing extends Anabul {
    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara guk-guk");
    }
}
