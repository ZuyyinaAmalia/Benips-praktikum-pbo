public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        T1 = new Titik(); //
        T1 = new Titik(3, 5);

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T2.getCounterTitik());

        // printCounterTitik();

        T1.printTitik();
        T1.refleksiX();
        T1.printTitik();

        System.out.println("nt");
        // Titik NT = getRefleksiX();

        System.out.println("COBAAAA");
        T1.absis = 1;
        System.out.println();
    }
}
