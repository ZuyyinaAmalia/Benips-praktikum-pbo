/* Nama File    : Persegi.java
 * Deskripsi    : class Persegi
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;
public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);

    }

    // public Persegi(double sisi,String warna,String border){
    //     super(4, warna, border);
    //     this.sisi = sisi;
    // }

    public Persegi(double sisi,String warna,String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    

    public double getSisi(){
        return sisi; 
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }
    
    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    // @Override
    // public void printInfo(){
    //     System.out.println("Warna Bangun Datar : "+getWarna());
    //     System.out.println("Border Bangun Datar : "+getBorder());
    //     System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());
    //     System.out.println("sisi " + sisi);
    // }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }


/*
1. Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
Mengapa?
--> bisa, karena atribut pada class bangun datar memiliki modifier public or protected.
    Berbeda saat modifier dari atributnya adalah private, maka atribut tersebut tidak dapat diakses
    secara langsung, harus menggunakan setter dan getter nya.
2. Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
--> tidak bisa, karena atribut dan method count bangun datar bersifat static. Jadi dia melekat pada class BangunDatar.
3. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran?
--> Maka semua atribut dan method yang ada di bangun datar tidak bisa diwariskan ke persegi dan lingkaran.
4. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
kelas Persegi dan Lingkaran?
--> semua atribut bisa diwariskan, semua method bisa diwariskan kecuali method printInfo() karena dia bersifat final.
    syntax final digunakan saat sebuah class, atribut, atau method tidak bisa diwariskan.
 */

}