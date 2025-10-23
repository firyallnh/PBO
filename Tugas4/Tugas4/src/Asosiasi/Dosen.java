package Asosiasi;

public class Dosen {
    private String nidn;
    private String nama;
    private Matakuliah[] mataKuliahDiampu;  
    
    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }
    
    public void setMatakuliah(Matakuliah[] mk) throws Exception {
        this.mataKuliahDiampu = mk;
    }
    
    public void infoDosen() {
        System.out.println("Dosen: " + nama + " (NIDN: " + nidn + ")");
        System.out.println("Mengampu mata kuliah:");
        for (Matakuliah mk : mataKuliahDiampu) {
            System.out.println("  - " + mk.getNamaMK() + " (" + mk.getKodeMK() + ")");
        }
        System.out.println();
    }
    
    public String getNama() {
        return nama;
    }
}