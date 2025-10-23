package Agregasi;

public class RakBuku {
    private String kodeRak;
    private Buku[] koleksiBuku;
    
    public RakBuku(String kodeRak) {
        this.kodeRak = kodeRak;
    }
    
    public void tambahBuku(Buku[] buku) throws Exception {
        this.koleksiBuku = buku;
    }
    
    public void tampilkanKoleksi() {
        System.out.println("Rak " + kodeRak + " berisi:");
        for (Buku buku : koleksiBuku) {
            System.out.println("📚 " + buku.getInfo());
        }
        System.out.println();
    } 
}
