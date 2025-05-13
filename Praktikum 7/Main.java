/* Nama File    : Main.java
 * Deskripsi    : mainclass dari Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package Praktikum7;
public class Main {
    public static void main(String[] args) {
        Datum<Kucing> dataKucing = new Datum<>();
        Kucing kucing = new Kucing();
        kucing.setNama("nezko");
        dataKucing.setIsi(kucing);

        Datum<Anjing> dataAnjing = new Datum<>();
        Anjing anjing = new Anjing();
        anjing.setNama("dofi");
        dataAnjing.setIsi(anjing);

        Datum<Burung> dataBurung = new Datum<>();
        Burung burung = new Burung();
        burung.setNama("luffy");
        dataBurung.setIsi(burung);

        ContohMetodeGenerik.printInfo(dataKucing);
        ContohMetodeGenerik.printInfo(dataAnjing);
        ContohMetodeGenerik.printInfo(dataBurung);
    }
}
