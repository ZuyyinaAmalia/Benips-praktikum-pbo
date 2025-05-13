/* Nama File    : Main.java
 * Deskripsi    : kelas koleksi
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package tugas.java;
import java.util.ArrayList;

public class Koleksi<T extends Anabul> {
    private ArrayList<T> wadah = new ArrayList<>();

    public void add(T item) {
        wadah.add(item);
    }

    public void showAll() {
        for (T item : wadah) {
            System.out.println("Nama: " + item.getNama());
            item.bersuara();
            item.gerak();
            System.out.println();
        }
    }
}

