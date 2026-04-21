/* Nama File    : Main.java
 * Deskripsi    : Main class untuk mendemonstrasikan semua bagian praktikum Pertemuan 7
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 21 April 2026
 */

public class Main {
    public static void main(String[] args) {
        // I. POLIMORFISME AD HOC COERSION
        System.out.println("I. POLIMORFISME AD HOC COERSION");
        int bil = 65;
        char c = (char) bil;
        double d = (double) bil;
        System.out.println("Integer: " + bil);
        System.out.println("Karakter: " + c);
        System.out.println("Real: " + d);

        double realVal = 65.0;
        int intVal = (int) realVal;
        System.out.println("Kembali ke Integer: " + intVal);

        String X = "1234", Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi S: " + S);
        System.out.println("Penjumlahan Z: " + Z);

        String P = "12.34", Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi R: " + R);
        System.out.println("Penjumlahan D: " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("Objek Integer A: " + A);
        String T = Integer.toString(A);
        System.out.println("Objek String T: " + T);

        // II. POLIMORFISME AD HOC OVERLOADING
        System.out.println("\nII. POLIMORFISME AD HOC OVERLOADING");
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1 (Default):");
        m1.cetak();

        Mahasiswa m2 = new Mahasiswa("24060122140123", "Budi Sudarsono", "Informatika");
        System.out.println("\nMahasiswa 2:");
        m2.cetak();

        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("\nMahasiswa 3 (Kloning M2):");
        m3.cetak();

        System.out.println("\nUji setProgramStudi (Kosong) pada M1:");
        m1.setProgramStudi();
        m1.cetak();

        System.out.println("\nUji setProgramStudi (Sistem Informasi) pada M1:");
        m1.setProgramStudi("Sistem Informasi");
        m1.cetak();

        System.out.println("\nUji setProgramStudi (Sama dengan M2) pada M1:");
        m1.setProgramStudi(m2);
        m1.cetak();

        // III. POLIMORFISME UNIVERSAL INCLUSION - ANABUL
        System.out.println("\nIII. ANABUL (INCLUSION)");
        Anabul myKucing = new Kucing();
        Anabul myAnjing = new Anjing();
        Anabul myBurung = new Burung();
        System.out.print("Kucing: "); myKucing.suara();
        System.out.print("Anjing: "); myAnjing.suara();
        System.out.print("Burung: "); myBurung.suara();

        // III. POLIMORFISME UNIVERSAL INCLUSION - SEMINAR
        System.out.println("\nIII. SEMINAR (INCLUSION)");
        Seminar sem = new Seminar();
        Dosen d1 = new Dosen("Dr. Lukman", "19700101");
        Dosen d2 = new Dosen("Ir. Sarah", "19750202");
        Mahasiswa m4 = new Mahasiswa("Alice", "24060101", "Informatika");
        Mahasiswa m5 = new Mahasiswa("Bob", "24060102", "Informatika");
        Mahasiswa m6 = new Mahasiswa("Charlie", "24060103", "Informatika");
        Mahasiswa m7 = new Mahasiswa("David", "24060104", "Informatika");
        Mahasiswa m8 = new Mahasiswa("Eve", "24060105", "Informatika");

        m4.setWali(d1); m5.setWali(d1); m6.setWali(d2); m7.setWali(d2); m8.setWali(d1);

        sem.registrasi(d1); sem.registrasi(d2);
        sem.registrasi(m4); sem.registrasi(m5); sem.registrasi(m6); sem.registrasi(m7); sem.registrasi(m8);

        System.out.println("Total Peserta: " + sem.countPeserta());
        sem.tampilPeserta();
        System.out.println("Jumlah Peserta Mahasiswa: " + sem.countMahasiswa());

        System.out.println("\nDetail Data Mahasiswa 4:");
        m4.tampilDataMahasiswa();

        System.out.println("\nRenungan Polimorfisme:");
        System.out.println("Polimorfisme adalah kemampuan suatu objek untuk memiliki banyak bentuk,");
        System.out.println("memungkinkan kode yang fleksibel melalui method overloading (Ad Hoc) ");
        System.out.println("maupun pewarisan/inclusion (Universal Subtyping).");
    }
}



// Renungan : Simpulkan bagaimana cara kerja Polimorfisme sesuai kalimat Anda sendiri! 
// Polimorfisme adalah kemampuan suatu objek untuk memiliki banyak bentuk, 
// dan memiliki banyak  perilaku atau sifat yang berbeda tergantung pada objeknya.