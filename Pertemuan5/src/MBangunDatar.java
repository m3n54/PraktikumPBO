/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk mengetes BangunDatar, Persegi, Lingkaran dan IResize
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // Eksperimen Part 1 Step 3
        System.out.println(" Eksperimen Part 1 Step 3");
        
        BangunDatar P1 = new Persegi(10);
        P1.setWarna("Merah");
        P1.setBorder("Tebal");
        P1.printInfo();

        Persegi P2 = new Persegi(5);
        P2.setWarna("Kuning");
        P2.printInfo();

        BangunDatar L1 = new Lingkaran(7);
        L1.setWarna("Biru");
        L1.printInfo();

        Lingkaran L2 = new Lingkaran(14);
        L2.setWarna("Hijau");
        L2.printInfo();

        System.out.println("\n Eksperimen Part 1 Step 5 (isEqualLuas & isEqualKeliling)");
        System.out.println("Apakah Luas P1 == Luas P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah Keliling L1 == Keliling L2? " + L1.isEqualKeliling(L2));
        
        System.out.println("Apakah Luas P1 == Luas L1? " + P1.isEqualLuas(L1));

        System.out.println("\n Eksperimen Part 2 Step 4 (IResize)");
        System.out.println("P2 Sisi Awal: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("P2 setelah zoomIn (1.1x): " + P2.getSisi());
        P2.zoomOut();
        System.out.println("P2 setelah zoomOut (0.9x): " + P2.getSisi());
        P2.zoom(50);
        System.out.println("P2 setelah zoom(50%): " + P2.getSisi());

        System.out.println("\nL2 Jari-jari Awal: " + L2.getJariJari());
        L2.zoom(200);
        System.out.println("L2 setelah zoom(200%): " + L2.getJariJari());
    }
}
