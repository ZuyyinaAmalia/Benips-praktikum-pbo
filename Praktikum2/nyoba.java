public class nyoba {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("PBO", "Pemograman Berorientasi Objek", 3);
        MataKuliah mbd = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa m1 = new Mahasiswa("234", "Ninabae", "Informatika");
        Dosen d1 = new Dosen("123", "Zuyyina", "Informatika");
        Kendaraan k1 = new Kendaraan("12343g", "mobil");

        m1.setDosenWali(d1);
        m1.setKendaraan(k1);
        m1.addMatkul(pbo);
        m1.addMatkul(mbd);
        m1.printDetailMhs();

        System.out.println("Jumlah Mata Kuliah = " + m1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + m1.getJumlahSks());
    }
}
