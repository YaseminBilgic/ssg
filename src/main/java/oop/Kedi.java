package oop;

public class Kedi extends  Hayvan{
    public Kedi(String tur) {
        super(tur);
    }
    String hayvanAdi="Tekir";

    @Override
    public void hareket() {
        System.out.println(getTur()+" zıplayarak hareket eder");
    }
    public void ses(){
        System.out.println(getTur()+" miyavlar");
    }

}
