/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;


import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;


/**
 *
 * @author Fauzi Amrullah
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        
        System.out.println("");
        
        // insert
        System.out.println("===Insert");
        Mahasiswa addMahasiswa = new Mahasiswa(4, "Ujang Spakbor");
        service.add(addMahasiswa);
        System.out.println("berhasil insert" + addMahasiswa);
        
        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setName("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        
        //delete
        System.out.println("===update");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
}

}
