/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

/******METHOD*******/
//konstruktor untuk membuat dosen tamu
public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, long gajiPokok, String fakultas, LocalDate kontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public int getSisaKontrak() {
        Period sisa = Period.between(LocalDate.now(), kontrakBerakhir);
        return sisa.getYears() * 12 + sisa.getMonths(); // Konversi ke bulan
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + NIP);
        System.out.println("NIDK\t\t: " + NIDK);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(TMT));
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + fakultas);
        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Sisa Kontrak\t: " + getSisaKontrak() + " bulan");
        System.out.println("Gaji Pokok\t: " + formatUang(gajiPokok));
        System.out.println("Tunjangan\t: 2.5% x " + formatUang(gajiPokok) + " = " + formatUang(getTunjangan()));
    }
}
