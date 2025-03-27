/* Nama File    : LaboratoriumKomputer.java
 * Deskripsi    : class LaboratoriumKomputer
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */
package RESPONSI;

public class LaboratoriumKomputer extends RuangLaboratorium{
    private int jumlahKomputer;
    protected static int counterLabKom = 0;

    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
        counterLabKom++;
    }

    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    public static void printCounterLabKom() {
        System.out.println("Jumlah lab Komputer" + counterLabKom);
    }
    @Override
    public void tampilkanDetailRuang() {
        System.out.println("Lab Komputer: " + namaLaboratorium);
        System.out.println("Ukuran: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Jumlah Komputer: " + jumlahKomputer);;
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("Harga Sewa: Rp " + hargaSewa);
        System.out.println("Jumlah lab Komputer : " + counterLabKom);
    }
}
