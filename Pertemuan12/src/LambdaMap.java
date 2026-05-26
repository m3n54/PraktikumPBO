import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan key (NIM)
 *            dan value (Nama Mahasiswa) menggunakan ekspresi lambda.
 */
public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM (key) dan Nama Mahasiswa (value)
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140123", "Adi");
        mahasiswaMap.put("24060122140124", "Bambang");
        mahasiswaMap.put("24060122140125", "Cici");
        mahasiswaMap.put("24060122140126", "Didi");

        // Menampilkan key dan value dari Map menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
