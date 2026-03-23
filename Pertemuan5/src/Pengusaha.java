/* Nama File    : Pengusaha.java
 * Deskripsi    : Kelas Pengusaha turunan dari Manusia
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() { return npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }

    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        int thnMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        int now = 2026;
        int B = 0; // Ganti dengan digit ke-13 NIM anda
        return (now - thnMulai) + B;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info Pengusaha");
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
    }
}
