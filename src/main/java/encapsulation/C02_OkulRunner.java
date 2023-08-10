package encapsulation;

public class C02_OkulRunner {
    public static void main(String[] args) {
        C01_Okul okul=new C01_Okul();
        okul.setOkulIsmi("TechProEd");
        okul.setMudur("Veli Can");
        okul.setTamGunMu(true);
        System.out.println(okul.getOkulIsmi());
        System.out.println(okul.getMudur());
        System.out.println(okul.getOgrenciSayisi());
        System.out.println(okul.getOgretmenSayisi());
        System.out.println(okul.getSinifSayisi());
        System.out.println(okul.isTamGunMu());
    }
}
