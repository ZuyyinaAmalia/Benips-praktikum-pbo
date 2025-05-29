/* Nama File    : Mahasiswa.java
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 29 Mei 2025
 */
package jdbc.model;


public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor default
    public Mahasiswa() {
        
    }

    // Constructor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // getter dan setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}

