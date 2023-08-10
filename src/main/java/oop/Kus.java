package oop;

public class Kus extends Hayvan{
    public Kus(String tur) {
        super(tur);
    }

    @Override
    public void hareket() {
        System.out.println(getTur()+" ucarak hareket etti");
    }

    public void ses(){
        System.out.println(getTur()+" oter");
    }
}
