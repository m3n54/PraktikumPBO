/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    /******METHOD*******/
    //konstruktor untuk membuat tendik
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, long gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        int masaKerjaTahun = getMasaKerja().getYears();
        return 0.01 * masaKerjaTahun * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + NIP);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(TMT));
        System.out.println("Jabatan\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t: " + bidang);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok\t: " + formatUang(gajiPokok));
        System.out.println("Tunjangan\t: 1% x " + masaKerja.getYears() + " x " + formatUang(gajiPokok) + " = " + formatUang(getTunjangan()));
    }
}
