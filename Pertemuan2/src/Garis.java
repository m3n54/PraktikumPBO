/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 24 Februari 2026
*/



public class Garis {
    /******ATRIBUT*******/ 
    Titik titikAwal;
    Titik titikAkhir;

    /******METHOD*******/
    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1).
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    //konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
    }

    //Selektor (getter) untuk setiap atribut beserta mutatornya (setter)
    


    //selektor untuk mendapatkan atribut statis CounterGaris


    //mendapatkan panjang sebuah garis


    //mendapatkan gradien dari sebuah garis

    //mendapatkan titik tengah dari sebuah garis

    


}
