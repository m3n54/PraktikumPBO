/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing sebagai turunan Anabul
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Anjing extends Anabul {
    private String nama;

    public Anjing(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    @Override
    public void suara() { System.out.println(nama + " bersuara: Guk-guk!"); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak: Melata (berjalan)"); }

    @Override
    public String toString() { return "Anjing(" + nama + ")"; }
}
