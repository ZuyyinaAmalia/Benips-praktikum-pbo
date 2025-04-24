/* Nama File    : Main Anabul.java
 * Deskripsi    : class Main Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> peliharaan = new ArrayList<>();

        peliharaan.add(new Kucing("Kucing"));
        peliharaan.add(new Anjing("Anjing"));
        peliharaan.add(new Burung("Burung"));

        for (Anabul hewan : peliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}