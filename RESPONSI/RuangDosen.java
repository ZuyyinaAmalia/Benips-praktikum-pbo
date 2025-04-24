/* Nama File    : RuangDosen.java
 * Deskripsi    : class RuangDosen
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

public class RuangDosen extends Ruang{
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    protected static int counterRuangDos = 0;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        counterRuangDos++;
    }
    public String getNamaDosen() {
        return namaDosen;
    }
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    public static void printCounterLabNonKom() {
        System.out.println("Jumlah ruang dosen" + counterRuangDos);
    }
    @Override
    public double hitungBiayaKebersihan() {
        return panjang * lebar * biayaKebersihan;
    }
    @Override
    public void tampilkanDetailRuang() {
        System.out.println("Ruang Dosen: " + kode);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Ukuran: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("Jumlah ruang dosen : " + counterRuangDos);
    }
}
