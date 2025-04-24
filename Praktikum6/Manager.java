/* Nama File    : Manager.java
 * Deskripsi    : class Manager
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */

class Manajer extends Pegawai {
    private int tunjangan = 700000;
    
    public Manajer(String nama) {
        this.setNama(nama);
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama : " + this.getNama() );
        System.out.println("Gaji pokok : " + this.getGajiPokok());
        System.out.println("Tunjangan : " + tunjangan);
    }
}