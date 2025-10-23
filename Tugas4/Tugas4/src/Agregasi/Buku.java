package Agregasi;

public class Buku {
    private String isbn;
    private String judul;
    
    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }
    
    public String getInfo() {
        return isbn + " - " + judul;
    }
}