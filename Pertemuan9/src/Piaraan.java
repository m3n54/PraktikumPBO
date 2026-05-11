/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas Piaraan untuk mengelola antrean Anabul (Koleksi Kelas Bentukan)
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam Antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0.0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Panggilan Anabul dan Jenisnya:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getSimpleName() + ")");
        }
    }
}
