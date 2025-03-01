/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method class Titik
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 20 Februari 2025
 */

public class Titik {
    // ATRIBUT
     double absis;
     double ordinat;
     static int counterTitik = 0;

    // METHOD
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        // absis = 0;
        // ordinat = 0;
        // counterTitik++;
        this(0,0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }
    
    // mengembalikan nilai absis
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru
    public void setAbsis(double x) {
        absis = x;
    }
    
    // mengeset ordinat titik dengan nilai baru
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat =  ordinat + y;
    }

    // mencetak koordinat titik 
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai counterTitik 
    static int getCounterTitik() {
        return counterTitik;
    }

    public void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    // int getKuadran() {
    //     if(absis >= 0 && ordinat >= 0) {

    //     }
    // }

    void refleksiX() {
        ordinat = ordinat * (-1);
    }

    Titik getRefleksiX() {
        // return new Titik(this.absis, this.ordinat*(-1));
        Titik NT = new Titik(this.absis, this.ordinat*(-1));

        return NT;
    }
}
