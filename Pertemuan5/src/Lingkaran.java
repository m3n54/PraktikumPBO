/* Nama File    : Lingkaran.java
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 17 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    /******ATRIBUT*******/
    private double jariJari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
        setJmlSisi(0);
    }

    public Lingkaran(double jariJari, String warna, String border){
        this.jariJari = jariJari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double getKeliling(){
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn(){
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut(){
        jariJari = jariJari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jariJari = jariJari * percent/100;
    }

    @Override
    public void printInfo(){
        System.out.println("Lingkaran");
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
