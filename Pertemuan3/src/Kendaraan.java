/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 03 Maret 2026
*/

public class Kendaraan {
    /******ATRIBUT*******/ 
    private String noPlat;
    private String jenis;


    /******METHOD*******/
    //kontruktor untuk membuat kendaraan dengan parameter
    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        if (jenis.equals("mobil") || jenis.equals("motor") || jenis.equals("becak")){
            this.jenis = jenis;
        } else {
            System.out.println("Jenis kendaraan tidak valid");
            this.jenis = "unknown";
        }
    }
    
    Kendaraan(){
        noPlat = "0";
        jenis = "0";
    }

    public String getJenis(){
        return jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        if (jenis.equals("mobil") || jenis.equals("motor") || jenis.equals("becak")){
            this.jenis = jenis;
        } else {
            System.out.println("Jenis kendaraan tidak valid");
        }
    }
}
