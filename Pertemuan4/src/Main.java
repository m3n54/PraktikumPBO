/* Nama File    : Main.java
 * Deskripsi    : berisi method main untuk menjalankan program
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Objek Dosen Tetap
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000, 
            "Fakultas Sains dan Matematika"
        );
        dosen1.printInfo();
        System.out.println("=========================================");

        // Objek Dosen Tamu
        DosenTamu dosen2 = new DosenTamu(
            "1234567890", 
            "87654321", 
            "Budi", 
            LocalDate.of(1985, 8, 15), 
            LocalDate.of(2020, 3, 1), 
            4000000, 
            "Fakultas Teknik",
            LocalDate.of(2027, 12, 31)
        );
        dosen2.printInfo();
        System.out.println("=========================================");

        // Objek Tendik
        Tendik tendik1 = new Tendik(
            "0987654321", 
            "Citra", 
            LocalDate.of(1995, 11, 20), 
            LocalDate.of(2018, 6, 1), 
            3000000, 
            "Akademik"
        );
        tendik1.printInfo();
    }
}
