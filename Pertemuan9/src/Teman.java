import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }
    public int getNbelm() {
        return nbelm;
        
    }
    
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
    

    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm--;
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
        int i = Lnama.indexOf(nama);
        if (i != -1)
            Lnama.set(i, namabaru);
    }

    public int countNama(String nama) {
        int i = 0;
        int count = 0;
        while (i < nbelm) {
            if (Lnama.get(i).equals(nama))
                count++;
            i++;
        }
        return count;
    }

    public void showTeman(){
        System.out.println("Daftar Teman:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lnama.get(i));
        }
    }
}



class TemanMain {
    public static void main(String[] args){
        Teman t = new Teman();
        t.addNama("Menza");
        t.addNama("Azka");
        t.addNama("Ferry");
    
        System.out.println("Jumlah Teman : " + t.getNbelm());

        System.out.println("Apakah 'Menza' ada di daftar Teman? " + t.isMember("Menza"));

        System.out.println("Jumlah Teman 'Menza' : " + t.countNama("Menza"));

        System.out.println("Daftar Teman:");
        t.showTeman();
    }
}
