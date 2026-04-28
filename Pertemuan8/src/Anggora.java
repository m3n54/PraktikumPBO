/* Nama File    : Anggora.java
 * Deskripsi    : Kelas Anggora sebagai turunan Kucing — Tugas I.1b
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " (Anggora) bersuara: Meong lembut~");
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " (Anggora) bergerak: Berjalan anggun");
    }

    @Override
    public String toString() {
        return "Anggora(" + getNama() + ", bobot=" + getBobot() + " kg)";
    }
}
