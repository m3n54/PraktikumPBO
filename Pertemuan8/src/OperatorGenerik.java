/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur generik Tukar dan fungsi generik Bobot2 — Tugas II.3
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */

public class OperatorGenerik {

    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
