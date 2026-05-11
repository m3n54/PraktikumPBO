/* Nama File    : Koleksi.java
 * Deskripsi    : Program Utama Praktikum 9 Koleksi (Teman & Piaraan/Anabul)
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 11 Mei 2026
 */

public class Koleksi {

    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Menza");
        t.addNama("Azka");
        t.addNama("Ferry");
        t.addNama("Devano");
        t.addNama("Menza");

        System.out.println("Jumlah Elemen (nbelm): " + t.getNbelm());
        System.out.println("Nama pada indeks 1: " + t.getNama(1));
        
        t.setNama(1, "Budi");
        System.out.println("Setelah setNama(1, 'Budi'), indeks 1: " + t.getNama(1));

        System.out.println("Apakah 'Ferry' member? " + t.isMember("Ferry"));
        
        t.gantiNama("Ferry", "Fery");
        System.out.println("Setelah gantiNama('Ferry', 'Fery'), apakah 'Fery' member? " + t.isMember("Fery"));

        System.out.println("Jumlah nama 'Menza': " + t.countNama("Menza"));

        t.delNama("Budi");
        System.out.println("Setelah delNama('Budi'), jumlah elemen: " + t.getNbelm());

        t.showTeman();

        Piaraan p = new Piaraan();
        
        Kucing k1 = new Kucing("Milo", 3.5);
        Anggora k2 = new Anggora("Mimi", 2.8);
        Kembangtelon k3 = new Kembangtelon("Moci", 3.0);
        Anjing a1 = new Anjing("Doggo");
        Burung b1 = new Burung("Ciko");

        p.enqueueAnabul(k1);    
        p.enqueueAnabul(k2);
        p.enqueueAnabul(k3);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        System.out.println("Jumlah Piaraan dalam antrean: " + p.getNbelm());
        
        p.showAnabul();
        p.showJenisAnabul();

        System.out.println("Banyak keluarga Kucing: " + p.countKucing());
        System.out.println("Total bobot keluarga Kucing: " + p.bobotKucing() + " kg");

        System.out.println("Anabul pertama dalam antrean (getAnabul): " + p.getAnabul().getNama());

        Anabul keluar = p.dequeueAnabul();
        System.out.println("Anabul yang keluar (dequeueAnabul): " + keluar.getNama());
        System.out.println("Jumlah Piaraan sekarang: " + p.getNbelm());

        System.out.println("Apakah k1 (Milo) masih member? " + p.isMember(k1));
        System.out.println("Apakah k2 (Mimi) member? " + p.isMember(k2));
    }
}
