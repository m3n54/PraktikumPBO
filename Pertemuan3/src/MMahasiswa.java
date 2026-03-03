/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 03 Maret 2026
*/


public class MMahasiswa {
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("MK001", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MK002", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("123456789", "Menza Isaiah Tampubolon", "Informatika");
        Dosen D1 = new Dosen("987654321", "Pak Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "mobil");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah yang diambil: " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS yang diambil: " + M1.getTotalSks());
    }
}
