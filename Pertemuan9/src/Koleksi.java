import java.util.ArrayList;
import java.util.List;

/* Nama File    : Koleksi.java
 * Deskripsi    : Praktikum 9 Koleksi (Teman & Piaraan/Anabul)
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 05 Mei 2026
 */

class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }
    public int getNbelm() {
        return nbelm;
        
    }
    
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
    

    public void delNama(String nama){
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
        int i = Lnama.indexOf(nama);
        if (i != -1)
            Lnama.set(i, namabaru);
    }

    public int countNama(String nama) {
        int i = 0;
        int count = 0;
        while (i < nbelm) {
            if (Lnama.get(i).equals(nama))
                count++;
            i++;
        }
        return count;
    }

    public void showTeman(){
        System.out.println("Daftar Teman:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lnama.get(i));
        }
    }
}

abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
}

class Piaraan {
    private int nbelm;
    private List<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new ArrayList<>();
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
        if (Lanabul.isEmpty()) {
            return null;
        }
        return Lanabul.get(0);
    }

    public Anabul dequeueAnabul() {
        if (Lanabul.isEmpty()) {
            return null;
        }
        nbelm--;
        return Lanabul.remove(0);
    }

    public void showAnabul() {
        System.out.println("Daftar anabul dalam antrean:");
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
        System.out.println("Daftar anabul + jenis objek:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getName() + ")");
        }
    }
}








public class Koleksi {

    public static void main(String[] args){
        Teman t = new Teman();
        t.addNama("Menza");
        t.addNama("Azka");
        t.addNama("Ferry");
        t.addNama("Devano");
        t.addNama("Basil");
        t.addNama("Ceasar");
        t.addNama("Bayu");
        t.addNama("Dinda");
        t.addNama("Elza");
        t.addNama("Ferdy");
        t.addNama("Opan");
        t.addNama("Hanif");
        t.addNama("Hasta");
        t.addNama("Izzat");
        t.addNama("Marchel");
        t.addNama("Rama");
        t.addNama("Lutfi");
        t.addNama("Nufal");
        t.addNama("Atta");
        t.addNama("Novelya");

        System.out.println("Jumlah Teman : " + t.getNbelm());

        System.out.println("Apakah 'Menza' ada di daftar Teman? " + t.isMember("Menza"));

        System.out.println("Jumlah Teman 'Menza' : " + t.countNama("Menza"));

        System.out.println();
        t.showTeman();

        System.out.println("\nAntrean Piaraan");
        Piaraan p = new Piaraan();
        Kucing k1 = new Kucing("Milo", 3.2);
        Kucing k2 = new Kucing("Mimi", 2.8);
        Anjing a1 = new Anjing("Doggo");
        Burung b1 = new Burung("Ciko");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(b1);

        p.showAnabul();
        p.showJenisAnabul();

        System.out.println("Jumlah anabul: " + p.getNbelm());
        System.out.println("Apakah k1 ada dalam antrean? " + p.isMember(k1));
        System.out.println("Anabul paling depan: " + p.getAnabul().getNama());
        System.out.println("Jumlah kucing: " + p.countKucing());
        System.out.println("Total bobot kucing: " + p.bobotKucing() + " kg");

        Anabul keluar = p.dequeueAnabul();
        if (keluar != null) {
            System.out.println("Dequeue: " + keluar.getNama());
        }
        System.out.println("Jumlah anabul setelah dequeue: " + p.getNbelm());
    }

    





}
