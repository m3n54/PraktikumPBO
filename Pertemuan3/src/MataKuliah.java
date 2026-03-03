/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 03 Maret 2026
*/

public class MataKuliah {
    /******ATRIBUT*******/ 
    private String idMatkul;
    private String nama;
    private int sks;

    /******METHOD*******/
    //kontruktor untuk membuat mata kuliah dengan parameter
    MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    MataKuliah(){
        idMatkul = "0";
        nama = "0";
        sks = 0;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}

