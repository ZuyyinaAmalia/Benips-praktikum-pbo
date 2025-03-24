/* Nama File    : BangunDatar.java
 * Deskripsi    : class BangunDatar
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 15 maret 2025
 */

package Praktikum4;
public abstract class BangunDatar implements IResize{
    protected double jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    
    
    public BangunDatar(){
        counterBangunDatar++;
    }
    
    
    public BangunDatar(double sisi,String warna,String border){
        this.jmlSisi = sisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar" + counterBangunDatar);
    }
    
    public double getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
    
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }
    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }


    
    
}
