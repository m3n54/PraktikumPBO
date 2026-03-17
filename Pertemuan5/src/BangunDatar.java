/* Nama File    : BangunDatar.java
 * Deskripsi    : Abstrak class yang berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public abstract class BangunDatar {
    /******ATRIBUT*******/
    private int jmlSisi;
    private String warna;
    private String border;

    /******METHOD*******/
    public BangunDatar(){
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }
    
    public void setBorder(String border){
        this.border = border;
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna bangun datar: " + warna);
        System.out.println("Border bangun datar: " + border);
    }
}