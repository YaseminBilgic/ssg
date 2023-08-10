package encapsulation;

public class C06_arabaRunner {
    public static void main(String[] args) {
        C07_ModelAraba araba=new C07_ModelAraba();
        araba.setYakitTuru("dizel");
        araba.setUretimYili(2021);
        System.out.println(araba.toString());

    }
}
