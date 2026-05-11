/* Nama File    : Kembangtelon.java
 * Deskripsi    : Kelas Kembangtelon sebagai turunan Kucing
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Kembangtelon extends Kucing {
    public Kembangtelon(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " (Kembangtelon) bersuara: Meong nyaring!");
    }
}
