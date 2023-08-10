package encapsulation;

public class C01_Okul {
    private String okulIsmi="Bilim Okulu";
    private String mudur="Ali Can";
    private int ogretmenSayisi=10;
    private int ogrenciSayisi=200;
    private int sinifSayisi=15;
    private boolean tamGunMu=false;

    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public void setTamGunMu(boolean tamGunMu) {
        this.tamGunMu = tamGunMu;
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public String getMudur() {
        return mudur;
    }

    public int getOgretmenSayisi() {
        return ogretmenSayisi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }

    public boolean isTamGunMu() {
        return tamGunMu;
    }
}
