/* Nama File    : Data.java
 * Deskripsi    : Kelas generik Data dengan atribut larik statik — Tugas III.4
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 4 Mei 2026
 */

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        // Larik statik berisi 100 elemen generik
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    /** 
     * Mengembalikan nilai elemen generik pada posisi sesuai parameter.
     * Parameter pos: 1..100
     */
    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return ruang[pos - 1];
        } else {
            System.out.println("Indeks di luar jangkauan (1-100)");
            return null;
        }
    }

    /**
     * Mengisi elemen pada posisi ruang yang tepat.
     * Parameter pos: 1..100
     */
    public void setIsi(int pos, T obj) {
        if (pos >= 1 && pos <= 100) {
            ruang[pos - 1] = obj;
            updateBanyak();
        } else {
            System.out.println("Indeks di luar jangkauan (1-100)");
        }
    }

    /**
     * Menghitung kembali jumlah elemen yang tidak null
     */
    private void updateBanyak() {
        int count = 0;
        for (T elemen : ruang) {
            if (elemen != null) {
                count++;
            }
        }
        this.banyak = count;
    }

    /** Mengembalikan banyak elemen efektif */
    public int getSize() {
        return banyak;
    }
}
