/* Nama File    : Anggora.java
 * Deskripsi    : Kelas Anggora sebagai turunan Kucing
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Anggora extends Kucing {
    public Anggora(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " (Anggora) bersuara: Meong lembut~");
    }
}
