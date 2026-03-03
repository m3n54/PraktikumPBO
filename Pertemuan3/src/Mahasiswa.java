/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Menza Isaiah Tampubolon
 * Tanggal      : 03 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {
    /******ATRIBUT*******/ 
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /******METHOD*******/
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }
    
    Mahasiswa(String nim, String nama, String prodi){
        this(nim, nama, prodi, new Dosen(), new Kendaraan());
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void addMatkul(MataKuliah matkul){
        listMatkul.add(matkul);
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public int getTotalSks(){
        int totalSks = 0;
        for (MataKuliah matkul : listMatkul){
            totalSks += matkul.getSks();
        }
        return totalSks;
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0; i < listMatkul.size(); i++){
            System.out.println("Mata Kuliah " + (i+1) + ": " + listMatkul.get(i).getNama());
        }
    }
}