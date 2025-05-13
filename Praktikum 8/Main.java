/* Nama File    : Main.java
 * Deskripsi    : mainclass dari Anabul
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 13 Mei 2025
 */
package tugas.java;
public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();

        String[] namaHewan = {
            "Mimi", "Oyen", "Coco",    
            "Doggy", "Riko", "Blacky", 
            "Birdy", "Tori", "Pino", "Chika" 
        };

        Kucing k1 = new Kucing();
        k1.setNama(namaHewan[0]);
        koleksiAnabul.add(k1);

        Kucing k2 = new Kucing();
        k2.setNama(namaHewan[1]);
        koleksiAnabul.add(k2);

        Kucing k3 = new Kucing();
        k3.setNama(namaHewan[2]);
        koleksiAnabul.add(k3);

        Anjing a1 = new Anjing();
        a1.setNama(namaHewan[3]);
        koleksiAnabul.add(a1);

        Anjing a2 = new Anjing();
        a2.setNama(namaHewan[4]);
        koleksiAnabul.add(a2);

        Anjing a3 = new Anjing();
        a3.setNama(namaHewan[5]);
        koleksiAnabul.add(a3);

        Burung b1 = new Burung();
        b1.setNama(namaHewan[6]);
        koleksiAnabul.add(b1);

        Burung b2 = new Burung();
        b2.setNama(namaHewan[7]);
        koleksiAnabul.add(b2);

        Burung b3 = new Burung();
        b3.setNama(namaHewan[8]);
        koleksiAnabul.add(b3);

        Burung b4 = new Burung();
        b4.setNama(namaHewan[9]);
        koleksiAnabul.add(b4);

        koleksiAnabul.showAll();
    }
}

