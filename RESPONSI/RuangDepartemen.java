/* Nama File    : RuangDepartemen.java
 * Deskripsi    : class RuangDepartemen
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

public class RuangDepartemen extends Ruang{
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private Departemen departemen;
    protected static int counterRuangDep = 0;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        counterRuangDep ++;
    }
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }
    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }

    public Departemen getDepartemen() {
        return departemen;
    }
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public static void printCounterLabNonKom() {
        System.out.println("Jumlah Ruang Departemen : " + counterRuangDep);
    }
    @Override
    public double hitungBiayaKebersihan() {
        return panjang * lebar * biayaKebersihan;
    }
    @Override
    public void tampilkanDetailRuang() {
        System.out.println("Ruang Departemen: " + kode);
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Nama Ketua Departemen: " + departemen.getKetuaDepartemen());
        System.out.println("Ukuran: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("Jumlah Ruang Departemen : " + counterRuangDep);
    }
}