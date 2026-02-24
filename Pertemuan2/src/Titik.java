/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 24 Februari 2026
*/

public class Titik {
    /******ATRIBUT*******/ 
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    /******METHOD*******/
    //konstruktor untuk membuat titik (0,0)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    void printCounterTitik(){
        System.out.println("Jumlah Objek Titik = " + counterTitik);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x; // Perhatikan: ini menggunakan x, seharusnya mungkin y?
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // menentukan kuadran titik
    void getKuadran(){
        if (absis > 0 && ordinat > 0){
            System.out.println("Titik berada pada kuadran I");
        } else if (absis < 0 && ordinat > 0){
            System.out.println("Titik berada pada kuadran II");
        } else if (absis < 0 && ordinat < 0){
            System.out.println("Titik berada pada kuadran III");
        } else if (absis > 0 && ordinat < 0){
            System.out.println("Titik berada pada kuadran IV");
        } else {
            System.out.println("Titik berada pada sumbu");
        }
    }

    // menghitung jarak titik ke pusat koordinat (0,0)
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // menghitung jarak titik ke titik lain
    double getJarak(){
        return Math.sqrt(Math.pow(absis - 0, 2) + Math.pow(ordinat - 0, 2));
    }

    // menentukan titik hasil refleksi terhadap sumbu X
    void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    // menentukan titik hasil refleksi terhadap sumbu Y
    void refleksiY(){
        this.absis = -this.absis;
    }

    double getRefleksiX(){
        return -this.ordinat;
    }

    double getRefleksiY(){
        return -this.absis;
    }

} // end class Titik