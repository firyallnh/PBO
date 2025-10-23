package Komposisi;

public class Handphone {
    private String merk;
    private Baterai baterai;
    public Handphone(String merk, int kapasitasBaterai) {
        this.merk = merk;
        this.baterai = new Baterai(kapasitasBaterai);  
    }
    
    public void infoHP() {
        System.out.println("Merk: " + merk);
        System.out.println("Baterai: " + baterai.getKapasitas() + " mAh");
        System.out.println();
    }
}
