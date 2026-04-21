/* Nama File    : Seminar.java
 * Deskripsi    : Kelas Seminar untuk mengelola pendaftaran peserta
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 21 April 2026
 */

public class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        this.pesertas = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas seminar penuh!");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
