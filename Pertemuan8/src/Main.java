/* Nama File    : Main.java
 * Deskripsi    : Program utama demonstrasi Generik
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Main {

    // Helper: cetak separator bagian
    static void header(String judul) {
        System.out.println("\n=================");
        System.out.println("  " + judul);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        header("I.2 -- Kelas Generik Datum");

        // Datum berisi Integer
        Datum<Integer> datumInt = new Datum<>(42);
        System.out.println("Datum Integer  -> " + datumInt);
        datumInt.setIsi(100);
        System.out.println("Setelah setIsi(100) -> " + datumInt.getIsi());

        // Datum berisi String
        Datum<String> datumStr = new Datum<>("Halo PBO!");
        System.out.println("Datum String   -> " + datumStr);
        datumStr.setIsi("Generik itu keren");
        System.out.println("Setelah setIsi -> " + datumStr.getIsi());

        // Datum berisi Anabul (polimorfisme)
        Anjing       doggo   = new Anjing("Rex");
        Anggora      anggora = new Anggora("Kitty", 3.5);
        Kembangtelon kemban  = new Kembangtelon("Tiger", 4.2);
        Burung       birdie  = new Burung("Tweety");

        Datum<Anabul> datumAnabul = new Datum<>(doggo);
        System.out.println("\nDatum<Anabul> awal  -> " + datumAnabul.getIsi());
        datumAnabul.getIsi().suara();

        datumAnabul.setIsi(anggora);
        System.out.println("Datum<Anabul> baru  -> " + datumAnabul.getIsi());
        datumAnabul.getIsi().suara();

        datumAnabul.setIsi(birdie);
        System.out.println("Datum<Anabul> baru  -> " + datumAnabul.getIsi());
        datumAnabul.getIsi().suara();

        // Datum khusus Kucing
        Datum<Kucing> datumKucing = new Datum<>(anggora);
        System.out.println("\nDatum<Kucing> -> " + datumKucing.getIsi());
        datumKucing.getIsi().suara();

        header("II.3a & II.3b -- Prosedur Generik Tukar");

        // Tukar sesama Integer
        Datum<Integer> dA = new Datum<>(3);
        Datum<Integer> dB = new Datum<>(6);
        System.out.println("\n[Integer] Sebelum: a=" + dA.getIsi() + ", b=" + dB.getIsi());
        OperatorGenerik.tukar(dA, dB);
        System.out.println("[Integer] Sesudah: a=" + dA.getIsi() + ", b=" + dB.getIsi());

        // Tukar sesama String
        Datum<String> dS1 = new Datum<>("Selamat");
        Datum<String> dS2 = new Datum<>("Pagi");
        System.out.println("\n[String]  Sebelum: s1=\"" + dS1.getIsi() + "\", s2=\"" + dS2.getIsi() + "\"");
        OperatorGenerik.tukar(dS1, dS2);
        System.out.println("[String]  Sesudah: s1=\"" + dS1.getIsi() + "\", s2=\"" + dS2.getIsi() + "\"");

        // Tukar sesama Anabul (Anjing <-> Anggora)
        Anjing  anjing2 = new Anjing("Buddy");
        Anggora angg2   = new Anggora("Luna", 2.8);
        Datum<Anabul> dAnabul1 = new Datum<>(anjing2);
        Datum<Anabul> dAnabul2 = new Datum<>(angg2);

        System.out.println("\n[Anabul]  Sebelum: d1=" + dAnabul1.getIsi() + ", d2=" + dAnabul2.getIsi());
        OperatorGenerik.tukar(dAnabul1, dAnabul2);
        System.out.println("[Anabul]  Sesudah: d1=" + dAnabul1.getIsi() + ", d2=" + dAnabul2.getIsi());
        System.out.print("d1 suara -> "); dAnabul1.getIsi().suara();
        System.out.print("d2 suara -> "); dAnabul2.getIsi().suara();

        // Tukar sesama Kucing 
        Datum<Kucing> dK1 = new Datum<>(anggora);
        Datum<Kucing> dK2 = new Datum<>(kemban);
        System.out.println("\n[Kucing]  Sebelum: k1=" + dK1.getIsi() + ", k2=" + dK2.getIsi());
        OperatorGenerik.tukar(dK1, dK2);
        System.out.println("[Kucing]  Sesudah: k1=" + dK1.getIsi() + ", k2=" + dK2.getIsi());

        header("II.3c -- Fungsi Generik Bobot2");

        // Anggora + Anggora
        Anggora a1 = new Anggora("Mochi", 3.0);
        Anggora a2 = new Anggora("Latte", 3.5);
        double jumlah1 = OperatorGenerik.bobot2(a1, a2);
        System.out.println("\nBobot2(" + a1 + ", " + a2 + ")");
        System.out.println("Jumlah bobot = " + jumlah1 + " kg");

        // Kembangtelon + Kembangtelon
        Kembangtelon kb1 = new Kembangtelon("Harimau", 5.1);
        Kembangtelon kb2 = new Kembangtelon("Macan", 4.7);
        double jumlah2 = OperatorGenerik.bobot2(kb1, kb2);
        System.out.println("\nBobot2(" + kb1 + ", " + kb2 + ")");
        System.out.println("Jumlah bobot = " + jumlah2 + " kg");

        // Anggora + Kembangtelon (keduanya Kucing)
        double jumlah3 = OperatorGenerik.bobot2(anggora, kemban);
        System.out.println("\nBobot2(" + anggora + ", " + kemban + ")");
        System.out.println("Jumlah bobot = " + jumlah3 + " kg");

        System.out.println("\n==========================================");
        System.out.println("  Selesai -- Praktikum 8 Generik");
        System.out.println("==========================================\n");
    }
}


// Refleksi : 
// Renungan : Simpulkan bagaimana cara kerja konsep Generik sesuai kalimat Anda sendiri!
// Laporkan hasil kerja Anda sesuai petunjuk Asisten!
// Konsep generik bekerja sebagai suatu konsep atau syarat yang memungkinkan satu kode digunakan untuk berbagai tipe data tanpa harus ditulis berulang kali.

