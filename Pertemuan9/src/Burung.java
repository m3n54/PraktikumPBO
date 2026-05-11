/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung sebagai turunan Anabul
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Cuit Cuit!");
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak: Terbang");
    }
}
