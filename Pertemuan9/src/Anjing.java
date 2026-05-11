/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing sebagai turunan Anabul
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Anjing extends Anabul {
    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Guk Guk!");
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak: Berlari");
    }
}
