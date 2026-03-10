/* Nama File    : MGaris.java
 * Deskripsi    : berisi method main dalam class MGaris
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 10 Maret 2026
*/

public class MGaris {
    public static void main(String[] args){
        Garis garis = new Garis(new Titik(0,0), new Titik(10,10));
        System.out.println("Panjang garis: " + garis.getPanjang());
        System.out.println("Gradien garis: " + garis.getGradien());
    }
}

