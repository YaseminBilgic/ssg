package encapsulation;

public class C04_HayvanlarRunner {
    public static void main(String[] args) {


        C03_Hayvanlar hayvanlar = new C03_Hayvanlar();
        System.out.println(hayvanlar.isAcikMi());
        System.out.println(hayvanlar.getAslan());
        System.out.println(hayvanlar.getKaplan());
        System.out.println(hayvanlar.getPanda());
        System.out.println(hayvanlar.getPenguen());
        System.out.println(hayvanlar.getTimsah());
        System.out.println(hayvanlar.getYilan());
    }
}

