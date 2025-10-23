package Asosiasi;

public class Matakuliah {  
    private String kodeMK;
    private String namaMK;
    private Dosen pengampu;
    
    public Matakuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }
    
    public void setPengampu(Dosen dosen) throws Exception {
        this.pengampu = dosen;
    }
    
    public String getKodeMK() {
        return kodeMK;
    }
    
    public String getNamaMK() {
        return namaMK;
    }
    
    public void infoMataKuliah() {
        System.out.println(namaMK + " (" + kodeMK + ")");
        System.out.println("Diampu oleh: " + pengampu.getNama());
    }
}