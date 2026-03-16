/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

/******METHOD*******/
//konstruktor untuk membuat pegawai
public abstract class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected long gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, long gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(this.TMT, LocalDate.now());
    }

    public abstract void printInfo();

    protected String formatTanggal(LocalDate date) {
        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return date.getDayOfMonth() + " " + namaBulan[date.getMonthValue()] + " " + date.getYear();
    }

    protected String formatUang(double nominal) {
        return String.format(new java.util.Locale("id", "ID"), "Rp %,.2f", nominal);
    }
}
