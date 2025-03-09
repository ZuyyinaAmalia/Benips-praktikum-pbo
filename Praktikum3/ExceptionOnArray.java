/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : program penggunaan eksepsi menggunakan class library java
 * Pembuat      : Zuyyina Amalia
 * Tanggal      :09 maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
