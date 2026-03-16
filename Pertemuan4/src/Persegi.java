/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

public class Persegi extends BangunDatar{
    /******ATRIBUT*******/
    private double sisi;

    /******METHOD*******/
    //konstruktor untuk membuat persegi
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public void getLuas(){
        double luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
    }

    public void getKeliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling persegi: " + keliling);
    }

    public void getDiagonal(){
        double diagonal = sisi * Math.sqrt(2);
        System.out.println("Diagonal persegi: " + diagonal);
    }


    @Override
    public void printInfo(){
        System.out.println("Jumlah sisi persegi: " + getJmlSisi());
        System.out.println("Warna persegi: " + getWarna());
        System.out.println("Border persegi: " + getBorder());
        System.out.println("Sisi persegi: " + sisi);
    }
}