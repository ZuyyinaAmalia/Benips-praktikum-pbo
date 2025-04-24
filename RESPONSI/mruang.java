/* Nama File    : mruang.java
 * Deskripsi    : class mruang
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 27 maret 2025
 */

import java.util.Arrays;

public class mruang {
    public static void main(String[] args) {

        Departemen informatika = new Departemen("Informatika", "Dr. Zuyyina Amalia", 7000);

        RuangLaboratorium labKomputer1 = new LaboratoriumKomputer(
            "LAB-001", 10, 8, 4, 30, "Lab Komputer A", 500000, 40);

        RuangLaboratorium labKimia = new LaboratoriumNonKomputer(
            "LAB-002", 12, 9, 5, 25, "Lab Kimia", 450000, 
            "Kimia", Arrays.asList("Kimia Dasar", "Kimia Organik"));

        RuangDepartemen ruangInformatika = new RuangDepartemen(
            "RG-INF-01", 15, 10, 4, 20, informatika, 10, 25, 5);

        RuangDosen ruangDosenInformatika = new RuangDosen(
            "DOS-INF-01", 6, 4, 3, 2, "Dr. Cahyo Widodo", 2, 1);

        RuangKelas kelasA = new RuangKelas(
            "KELAS-A1", 12, 8, 4, 40, 40, 2);

        informatika.tambahRuang(ruangInformatika);
        informatika.tambahRuang(ruangDosenInformatika);

        System.out.println("=== Detail Ruangan ===");
        labKomputer1.tampilkanDetailRuang();
        System.out.println("\n");
        labKimia.tampilkanDetailRuang();
        System.out.println("\n");
        ruangInformatika.tampilkanDetailRuang();
        System.out.println("\n");
        ruangDosenInformatika.tampilkanDetailRuang();
        System.out.println("\n");
        kelasA.tampilkanDetailRuang();
    }
}
