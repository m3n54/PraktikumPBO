/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

public class Pegawai {

    /******ATRIBUT*******/
    private String nama;
    private String NIP;
    private String tanggalLahir;
    private String TMT;
    private String gajiPokok;

    /******METHOD*******/
    public Pegawai(String nama, String NIP, String tanggalLahir, String TMT, String gajiPokok){
        this.nama = nama;
        this.NIP = NIP;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(String TMT){
        this.TMT = TMT;
    }

}
