/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing sebagai turunan Anabul
 *                dengan tambahan atribut bobot (kg) — Tugas I.1a
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class Kucing extends Anabul {
    private String nama;
    private double bobot;

    public Kucing(String nama, double bobot) {
        this.nama  = nama;
        this.bobot = bobot;
    }

    public String getNama()  { return nama; }
    public double getBobot() { return bobot; }
    public void   setBobot(double bobot) { this.bobot = bobot; }

    @Override
    public void suara() { System.out.println(nama + " bersuara: Meong!"); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak: Melata (berjalan)"); }

    @Override
    public String toString() {
        return "Kucing(" + nama + ", bobot=" + bobot + " kg)";
    }
}
