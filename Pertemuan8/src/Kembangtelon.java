/* Nama File    : Kembangtelon.java
 * Deskripsi    : Kelas Kembangtelon sebagai turunan Kucing — Tugas I.1b
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " (Kembangtelon) bersuara: Meong keras!");
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " (Kembangtelon) bergerak: Berlari cepat");
    }

    @Override
    public String toString() {
        return "Kembangtelon(" + getNama() + ", bobot=" + getBobot() + " kg)";
    }
}
