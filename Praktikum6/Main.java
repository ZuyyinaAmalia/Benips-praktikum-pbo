/* Nama File    : Main.java
 * Deskripsi    : class Main manager
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        System.out.println("Nama : Zuyyina Amalia ");
        System.out.println("NIM  : 24060123120018 ");
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
    
    /*
    2. Jelaskan manfaat polimorfisme pada kasus ini
    --> dengan menggunakan poliformise, kita bisa menggunakan satu jenis tipe (yaitu parent class) 
    untuk membuat beberapa instance. Jadi walaupun dalam berbagai jenis instance tersebut memiliki
    atribut yang berbeda, tetapi kita bisa memanggil dengan fungsi yang sama 
    yaitu tampilData() tanpa harus mengubah jenis instance tersebut. 
    Hal ini membuat program menjadi lebih sederhana dan mudah dikembangkan.
    
    3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
       permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
    --> Kalau tidak menggunakan polimorfisme, maka setiap kali kita ingin menambah instance
    seperti pegawai4 dan pegawai5, kita harus menyebutkan tipe aslinya satu per satu 
    dan tidak bisa digabung dalam satu daftar list.
    */
}