/* Nama File    : main.java
 * Deskripsi    : class main
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;

public class main {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi(4, "Coklat", "Haha");
        // BangunDatar B1 = new BangunDatar();
        // kode diast merah, karena bangun dtaar merupakan class abstrack dan kelas abstack tidak 
        // bisa dibuat menjadi suatu objek baru (diinstansiasi), hanya bisa dijadikan sebagai data type
        BangunDatar P1 = new Persegi();
        Persegi P2 = new Persegi();
        BangunDatar L1 = new Lingkaran(5, "kuning", "tebal");
        Lingkaran L2 = new Lingkaran();

        System.out.println("Banyak sisi = " + p2.getSisi());
        System.out.println("Luas = " + p2.getLuas());
        System.out.println("Keliling = " + p2.getKeliling());
        System.out.println("apakah luasnya sama = " + P1.isEqualLuas(L2));
        System.out.println("apakah kelilingnya sama = " + P1.isEqualKeliling(L2));
        /* metod isequal bisa untuk membandingkan 2luas dan keliling 2 bangun datar yang berbeda */

        L1.printInfo();
        L1.zoomIn();
        L1.zoom(100);
        L1.printInfo();


        /*
         *  1. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
              dan isEqualKeliling pada class BangunDatar? Mengapa?
            -->  tidak bisa, karena di dalam class bangun datar belum memiliki method getKeliling() dan method getLuas()
            2. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
            --> dengan menjadikan class bangunDatar sebagai abstact class kita bisa memanggil fungsi getLuas dan getKeliling sehingga
                kita tidak perlu membuat fungsi tersebut pada masing2 subclassnya
         */
    }
}
