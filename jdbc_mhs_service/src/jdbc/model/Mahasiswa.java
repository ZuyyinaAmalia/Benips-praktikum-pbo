/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Fauzi Amrullah
 */
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

