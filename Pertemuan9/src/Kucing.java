/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing sebagai turunan Anabul
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Meong!");
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak: Berjalan");
    }
}
