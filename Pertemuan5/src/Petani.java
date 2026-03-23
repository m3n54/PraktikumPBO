/* Nama File    : Petani.java
 * Deskripsi    : Kelas Petani turunan dari Manusia
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() { return asal_kota; }
    public void setAsalKota(String asal) { this.asal_kota = asal; }

    public static int getCounterPetani() { return counterPetani; }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        int thnMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        int now = 2026;
        int C = 0;
        return (now - thnMulai) + C;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Info Petani");
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
    }
}
