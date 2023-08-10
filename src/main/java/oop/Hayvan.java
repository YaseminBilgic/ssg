package oop;

public class Hayvan {
    private String tur;

    String hayvanAdi="boncuk";

    public Hayvan(String tur){
        this.tur=tur;
    }

    public void beslen(){
        System.out.println(tur+" beslendi");
    }
    public void hareket(){
        System.out.println(tur+" hareket etti");
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
