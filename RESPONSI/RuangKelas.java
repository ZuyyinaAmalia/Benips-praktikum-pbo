/* Nama File    : RuangKelas.java
 * Deskripsi    : class RuangKelas
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

public class RuangKelas extends Ruang{
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    protected static int counterRuangKel = 0;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
        counterRuangKel++;
    }
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }
    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }
    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }
    public static void printCounterLabNonKom() {
        System.out.println("Jumlah Ruang Kelas : " + counterRuangKel);
    }
    @Override
    public void tampilkanDetailRuang() {
        System.out.println("Ruang Kelas: " + kode);
        System.out.println("Ukuran: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("Jumlah Ruang Kelas : " + counterRuangKel);
    }
}
