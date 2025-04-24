/* Nama File    : Programmer.java
 * Deskripsi    : class Programmer
 * Pembuat      : Zuyyina Amalia
 * Tanggal      : 24 April 2025
 */
class Programmer extends Pegawai {
    private int bonus = 450000;
    
    public Programmer(String nama) {
        this.setNama(nama);
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama : " + this.getNama() );
        System.out.println("Gaji pokok : " + this.getGajiPokok());
        System.out.println("Bonus : " + bonus);
    }
}