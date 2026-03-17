/* Nama File    : Persegi.java
 * Deskripsi    : Berisi atribut dan method dalam class Persegi
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    /******ATRIBUT*******/
    private double sisi;

    /******METHOD*******/
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi){
        this.sisi = sisi;
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

    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    public void getDiagonal(){
        double diagonal = sisi * Math.sqrt(2);
        System.out.println("Diagonal persegi: " + diagonal);
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }

    @Override
    public void printInfo(){
        System.out.println("Persegi");
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
