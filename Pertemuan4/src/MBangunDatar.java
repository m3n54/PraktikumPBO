public class MBangunDatar {
    public static void main(String[] args){
        Persegi persegi = new Persegi(10, "merah", "tebal");
        System.out.println("Persegi:");
        persegi.printInfo();
        persegi.getLuas();
        persegi.getKeliling();
        persegi.getDiagonal();

        System.out.println();
        Lingkaran lingkaran = new Lingkaran(10, "biru", "tipis");
        System.out.println("Lingkaran:");
        lingkaran.printInfo();
        lingkaran.getLuas();
        lingkaran.getKeliling();
    }
}
