/* Nama File    : Dosen.java
 * Deskripsi    : Subclass Dosen dari CivitasAkademika
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 21 April 2026
 */

public class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public Dosen() {
        super("n/a");
        this.nip = "-999";
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}
