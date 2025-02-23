/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method class Titik
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 20 Februari 2025
 */
public class Garis {
        // Atribut
        Titik titikAwal;
        Titik titikAkhir;
        static int counterGaris = 0;

        // Method

        Garis() {
            this.titikAwal = new Titik();
            this.titikAkhir = new Titik(1,1);
            counterGaris++;
        }

        Garis(Titik var1, Titik var2) {
            this.titikAwal = var1;
            this.titikAkhir = var2;
            counterGaris++;
        }

        Titik getTitikAwal() {
            return this.titikAwal;
        }

        void setTitikAwal(Titik var1) {
            this.titikAwal = var1;
        }
        
        Titik getTitikAkhir() {
            return this.titikAkhir;
        }

        void setTitikAkhir(Titik var2) {
            this.titikAwal = var2;
        }

        static int getCunterGaris() {
            return counterGaris;
        }

        double panjangGariss() {
            return Math.sqrt(Math.pow(((this.getTitikAkhir()).getAbsis() - (this.getTitikAwal()).getAbsis()), 2) + Math.pow(((this.getTitikAkhir()).getOrdinat() - (this.getTitikAwal()).getOrdinat()), 2));
        }

        double gradienGaris () {
            if ((this.getTitikAwal()) != (this.getTitikAkhir())) {
                return ((this.getTitikAkhir()).getOrdinat() - (this.getTitikAwal()).getOrdinat() ) / ((this.getTitikAkhir()).getAbsis() - (this.getTitikAwal()).getAbsis() );
            } else {
                return -99999999;
            }
        }

        Titik titikTengah() {
            return new Titik( (((this.getTitikAkhir()).getAbsis() + (this.getTitikAwal()).getAbsis()) /2) , ( ((this.getTitikAkhir()).getOrdinat() + (this.getTitikAwal()).getOrdinat()) / 2) );
        }

        boolean garisSejajar (Garis g) {
            if (this.gradienGaris() == g.gradienGaris()) {
                return true;
            } else {
                return false;
            }
        }

        boolean isTegakLurus (Garis g) {
            if (this.gradienGaris() * g.gradienGaris() == -1.00 ) {
                return true;
            } else {
                return false;
            }
        }

        void tampilTitik () {
            System.out.println("titik awal = " );
            (this.getTitikAwal()).printTitik();
            System.out.println("titik akhir = " );
            (this.getTitikAkhir()).printTitik();
        }

        void persamaanGaris() {
            double m = this.gradienGaris();
            double c = ((this.getTitikAwal()).getOrdinat()) - ((m) * ((this.getTitikAwal()).getAbsis())) ;
            System.out.println("persamaan garis => y = " + m + "x + " + c ) ;
        }


}
