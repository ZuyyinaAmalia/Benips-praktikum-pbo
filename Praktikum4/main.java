package Praktikum4;

public class main {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi(4, "Coklat", "Haha");

        System.out.println("Banyak sisi = " + p2.getSisi());
        System.out.println("Luas = " + p2.getLuas());
        System.out.println("Keliling = " + p2.getKeliling());
    }
}
