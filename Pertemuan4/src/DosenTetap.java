/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;


public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, long gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        int masaKerjaTahun = getMasaKerja().getYears();
        return 0.02 * masaKerjaTahun * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + NIP);
        System.out.println("NIDN\t\t: " + NIDN);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(TMT));
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok\t: " + formatUang(gajiPokok));
        System.out.println("Tunjangan\t: 2% x " + masaKerja.getYears() + " x " + formatUang(gajiPokok) + " = " + formatUang(getTunjangan()));
    }
}
