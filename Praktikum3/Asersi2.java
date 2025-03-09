/* Nama File    : Asersi2.java
 * Deskripsi    : program untuk demo asersi, yang akan menolak input 
                  jari jari lingkaran yang bernilai nol
 * Pembuat      : Zuyyina Amalia
 * Tanggal      :09 maret 2025
 */

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran satu = new Lingkaran(jariJari);
        double kelilingLingkaran = satu.hitungKeliling();
        System.out.println("Keliling lingkaran = " +kelilingLingkaran);
    }    
}

/*
 * pertanyaan :
   secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
--> kode assert akan dieksekusi jika kita menggunakan -enableassertions / -ea Asersi2 pada terminal.
    oleh karena itu, apabila kita tidak memanggil -ea, program diats tetap akan dieksekusi dan membuat objek dengan jari-jari nol.
--> di modu, penamaan variabel satu nya menggunakan angka "1", dan itu tidak memenuhi standar pemberian nama variabel, sehingga menyebabkan error
 * 
 */
