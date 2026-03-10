/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    /******ATRIBUT*******/
    private double jariJari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jariJari = diameter / 2;
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

    public void getLuas(){
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luas);
    }
    
    public void getKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling);
    }

    @Override
    public void printInfo(){
        double diameter = 2 * jariJari;
        System.out.println("Jari-jari lingkaran: " + jariJari);
        System.out.println("Diameter lingkaran: " + diameter);
        System.out.println("Jumlah sisi lingkaran: " + getJmlSisi());
        System.out.println("Warna lingkaran: " + getWarna());
        System.out.println("Border lingkaran: " + getBorder());
    }
}
