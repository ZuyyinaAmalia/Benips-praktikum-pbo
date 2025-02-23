/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method class Titik
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 20 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(2, 3);
        Titik T2 = new Titik(4, 5);
        Garis G1 = new Garis();
        Garis G2 = new Garis(T1, T2);

        System.out.println("counter garis = " + Garis.getCunterGaris());

        System.out.println("panjang garis = " + G1.panjangGariss());
        System.out.println("panjang garis = " + G2.panjangGariss());
        System.out.println("gradien garis garis = " + G2.gradienGaris());
        
        Titik TT = (G2.titikTengah());
        System.out.println("titik tengah =");
        TT.printTitik();
        
        System.out.println("apakah sejajar = " + G1.garisSejajar(G2));
        System.out.println("apakah tegak lurus = " + G1.isTegakLurus(G2));

        G2.tampilTitik();
        G2.persamaanGaris();
    }
}
