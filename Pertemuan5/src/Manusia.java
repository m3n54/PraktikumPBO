/* Nama File    : Manusia.java
 * Deskripsi    : Abstrak class Manusia
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public abstract class Manusia {
    protected String nama;
    protected String tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector & Mutator
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTglMulaiKerja() { return tgl_mulai_kerja; }
    public void setTglMulaiKerja(String tgl) { this.tgl_mulai_kerja = tgl; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public double getPendapatan() { return pendapatan; }
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }

    public static int getCounterMns() { return counterMns; }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tgl Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
