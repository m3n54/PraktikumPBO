/* Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak Anabul dengan atribut panggilan
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public abstract class Anabul {
    private String panggilan;

    public Anabul() {
        this.panggilan = "";
    }

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    // Fungsi getNama() mengembalikan atribut panggilan
    public String getNama() {
        return panggilan;
    }

    // Prosedur setNama(nama) mengubah atribut panggilan
    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public abstract void suara();
    public abstract void gerak();
}
