package Asosiasi;

public class Main {
        public static void main(String[] args) throws Exception {
        Dosen dosen1 = new Dosen("D001", "Amir");
        Dosen dosen2 = new Dosen("D002", "Andiani");
        
        Matakuliah pbo = new Matakuliah("MD01", "Matematika Diskrit");
        Matakuliah aok = new Matakuliah("AOK01", "Arsitektur dan Organisasi Komputer");
        Matakuliah logmat = new Matakuliah("LM01", "Logika Matematika");
        
        dosen1.setMatakuliah(new Matakuliah[]{pbo, aok});
        dosen2.setMatakuliah(new Matakuliah[]{logmat});
        
        pbo.setPengampu(dosen1);
        aok.setPengampu(dosen2);
        logmat.setPengampu(dosen2);
        
        dosen1.infoDosen();
        dosen2.infoDosen();
        
        pbo.infoMataKuliah();
    }
}
