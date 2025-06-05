/*
Nama file : DiskonLambda.java
Deskripsi file : Dasar Ekspresi Lambda 
Nama saya : Zuyyina Amalia
Tanggal : 02 Juni 2025
*/
package lastpraktikum;

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        
//        dengan lambda 
    IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
    IDiskon diskonBiasa = (harga) -> {
        return  harga - (harga * 0.1);
    };
    System.out.println("Diskon Merdeka : " +diskonMerdeka.hitungDiskon(45000));
    System.out.println("Diskon lebaran : "+diskonLebaran.hitungDiskon(45000));
    System.out.println("Diskon biasa : " +diskonBiasa.hitungDiskon(45000));
    }
}
