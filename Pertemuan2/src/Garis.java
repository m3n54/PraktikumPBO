/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 24 Februari 2026
*/



public class Garis {
    /******ATRIBUT*******/ 
    Titik titikAwal;
    Titik titikAkhir;
    private static int CounterGaris = 0;

    /******METHOD*******/
    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1).
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
        CounterGaris++;
    }

    //konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        CounterGaris++;
    }

    //Selektor (getter) untuk setiap atribut beserta mutatornya (setter)
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    //selektor untuk mendapatkan atribut statis CounterGaris
    public static int getCounterGaris(){
        return CounterGaris;
    }


    //mendapatkan panjang sebuah garis  
    public double getPanjang(){
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    //mendapatkan gradien dari sebuah garis
    public double getGradien(){
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return deltaY / deltaX;
    }

    //mendapatkan titik tengah dari sebuah garis

    


}
