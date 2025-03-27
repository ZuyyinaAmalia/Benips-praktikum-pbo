package RESPONSI;

import java.util.ArrayList;
import java.util.List;

public class Departemen extends Ruang{
    private String nama;
    private String ketuaDepartemen;
    private double tarifBiayaKebersihan;
    private List<Ruang> ruangDepartemen;

    public Departemen(String nama, String ketuaDepartemen, double tarifBiayaKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
        this.ruangDepartemen = new ArrayList<>();
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama;
    }
    public String getKetuaDepartemen() { 
        return ketuaDepartemen; 
    }
    public void setKetuaDepartemen(String ketuaDepartemen) { 
        this.ketuaDepartemen = ketuaDepartemen;
    }
    public double getTarif() {
        return tarifBiayaKebersihan;
    }
    public void setTarif(double tarifBiayaKebersihan) {
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }

    @Override
    public double hitungBiayaKebersihan() {
        return panjang * lebar * tarifBiayaKebersihan;
    }

    public void tampilkanDetailRuang(){};

    public void tambahRuang(Ruang ruang) {
        ruangDepartemen.add(ruang);
    }

}
