/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 03 Maret 2026
*/


import java.util.ArrayList;

public class Dosen {
    /******ATRIBUT*******/
    private String nip;
    private String nama;
    private String prodi;

    /******METHOD*******/
    //kontruktor untuk membuat dosen dengan parameter
    Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    Dosen(){
        nip = "0";
        nama = "0";
        prodi = "0";
    }

    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }

    public String getProdi(){
        return prodi;
    }


}
