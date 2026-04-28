/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung sebagai turunan Anabul
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Burung extends Anabul {
    private String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    @Override
    public void suara() { System.out.println(nama + " bersuara: Cuit-cuit!"); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak: Terbang"); }

    @Override
    public String toString() { return "Burung(" + nama + ")"; }
}
