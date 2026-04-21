/* Nama File    : CivitasAkademika.java
 * Deskripsi    : class untuk civitas akademika
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 21 April 2026
 */

public abstract class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}
