/* Nama File    : Mahasiswa.java
 * Deskripsi    : Unified Mahasiswa class satisfying Section II and III requirements
 * Pembuat      : Menza Isaiah Tampubolon
 * NIM          : 24060124140138
 * Tanggal      : 21 April 2026
 */

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private String programStudi;
    private Dosen dosenWali;

    // Constructors (Section II.2.c, d, e)
    public Mahasiswa() {
        super("n/a");
        this.nim = "-999";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        super(nama);
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        super(m.getNama());
        this.nim = m.nim;
        this.programStudi = m.programStudi;
        this.dosenWali = m.dosenWali;
    }

    // Overloaded setProgramStudi (Section II.2.a)
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    // Section III.4.i
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // Section III.4.j
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Program Studi: " + programStudi);
        if (dosenWali != null) {
            System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Nama Dosen Wali: Belum ada");
        }
    }

    // For debugging/display
    public void cetak() {
        tampilDataMahasiswa();
    }

    @Override
    public String getNomor() {
        return nim;
    }
}
