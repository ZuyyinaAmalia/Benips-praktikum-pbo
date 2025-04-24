/* Nama File    : LaboratoriumNonKomputer.java
 * Deskripsi    : class LaboratoriumNonKomputer
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

import java.util.List;

public class LaboratoriumNonKomputer extends RuangLaboratorium {
    private String jenisLaboratorium;
    private List<String> daftarMataKuliah;
    protected static int counterLabNonKom = 0;

    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, String jenisLaboratorium, List<String> daftarMataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.jenisLaboratorium = jenisLaboratorium;
        this.daftarMataKuliah = daftarMataKuliah;
        counterLabNonKom++;
    }
    public String getJenisLaboratorium() {
        return jenisLaboratorium;
    }
    public void setJenisLaboratorium(String jenisLaboratorium) {
        this.jenisLaboratorium = jenisLaboratorium;
    }

    public List<String> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
    public void setDaftarMataKuliah(List<String> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }

    public static void printCounterLabNonKom() {
        System.out.println("Jumlah lab Non Komputer" + counterLabNonKom);
    }
    
    @Override
    public void tampilkanDetailRuang() {
        System.out.println("Lab " + jenisLaboratorium + ": " + namaLaboratorium);
        System.out.println("Ukuran: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Mata Kuliah: " + String.join(", ", daftarMataKuliah));
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
        System.out.println("Harga Sewa: Rp " + hargaSewa);
        System.out.println("Jumlah lab Non Komputer : " + counterLabNonKom);
    }
}
