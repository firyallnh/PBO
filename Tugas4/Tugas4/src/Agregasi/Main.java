package Agregasi;

public class Main {
        public static void main(String[] args) throws Exception {
        Buku buku1 = new Buku("001", "Pemrograman Java");
        Buku buku2 = new Buku("002", "Struktur Data");
        Buku buku3 = new Buku("003", "Algoritma");
        
        RakBuku rakA = new RakBuku("A001");
        RakBuku rakB = new RakBuku("B001");
        
        rakA.tambahBuku(new Buku[]{buku1, buku2});
        rakB.tambahBuku(new Buku[]{buku3});
        
        rakA.tampilkanKoleksi();
        rakB.tampilkanKoleksi();
    }
}
