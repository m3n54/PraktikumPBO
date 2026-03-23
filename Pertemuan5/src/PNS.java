/* Nama File    : PNS.java
 * Deskripsi    : Kelas PNS turunan dari Manusia
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        int thnMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        int now = 2026;
        int A = 0;
        return (now - thnMulai) + A;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info PNS");
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
    }
}
