/* Nama File    : RuangLboratorium.java
 * Deskripsi    : class RuangLboratorium
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

public class RuangLaboratorium extends Ruang {
    protected String namaLaboratorium;
    protected double hargaSewa;

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
    }
    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }
    public void setNamaLaboratorium(String namaLaboratorium) {
        this.namaLaboratorium = namaLaboratorium;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    public void tampilkanDetailRuang(){};
}
