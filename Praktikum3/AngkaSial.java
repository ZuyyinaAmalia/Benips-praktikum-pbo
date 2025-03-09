/* Nama File    : AngkaSial.java
 * Deskripsi    : program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Zuyyina Amalia
 * Tanggal      :09 maret 2025
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method get message() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
 pertanyaan :
 1.ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
--> baris 12 tidak akan dieksekusi jika angka yang diberikan bernilai 13. Saat itu terjadi, program akan langsung keluar dari method cobaAngka dan akan langsung ditangkah blok catch yang berada di main
 * 
 * 
 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
 --> baris 21 = baris catch???
 kode yang ada di blok catch akan dieksekusi jika angka yang diberikan bernilai 13.
 * 
 * 
 */