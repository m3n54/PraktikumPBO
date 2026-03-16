/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

import java.time.LocalDate;

/******METHOD*******/
public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, long gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
}
