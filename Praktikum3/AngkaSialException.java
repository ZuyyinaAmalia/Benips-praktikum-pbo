/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Zuyyina Amalia
 * Tanggal      :09 maret 2025
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan masukkan angka 13 karena angka sial!");
    }
}
