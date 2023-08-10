package oop;

public class Runner {
    public static void main(String[] args) {
        Kus marti=new Kus("marti");
        marti.beslen();
        marti.hareket();
        marti.ses();
        System.out.println("----------------------------------");
        Kedi tekir=new Kedi("tekir");
        tekir.hareket();
        tekir.beslen();
        tekir.ses();
        System.out.println(tekir.hayvanAdi);
        System.out.println("-----------------------------------");
        Hayvan balik=new Hayvan("balik");
        balik.hareket();
        balik.beslen();
        Hayvan kedi=new Kedi("Scottish");
        kedi.beslen();
        kedi.hareket();
        System.out.println(kedi.hayvanAdi);

    }
}
