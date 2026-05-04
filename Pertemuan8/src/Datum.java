/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum dengan atribut bertipe generik — Tugas I.2
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 28 April 2026
 */


public class Datum<T> {
    private T isi;

    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    /** Mengembalikan nilai isi Datum */
    public T getIsi() {
        return isi;
    }

    /** Mengubah isi Datum menjadi isiBaru */
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }

    @Override
    public String toString() {
        return "Datum{isi=" + isi + "}";
    }
}
