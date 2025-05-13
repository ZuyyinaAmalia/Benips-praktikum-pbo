/* Nama File    : Datum.java
 * Deskripsi    : genericmethodclass 
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package Praktikum7;

public class ContohMetodeGenerik {
    public static <T extends Anabul> void printInfo(Datum<T> data) {
        T anabul = data.getIsi();
        anabul.bersuara();
        anabul.gerak();
    }
}
