/* Nama File    : Datum.java
 * Deskripsi    : genericclass 
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package Praktikum7;

public class Datum <T>{
    private T isi;
    
    public T getIsi(){
        return isi;
    }
    
    public void setIsi(T isi) {
        this.isi = isi;
    }
}
