package doWhileLoop;

public class C03_doLoop {
    public static void main(String[] args) {
        //Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        int sayi=81;
        int bolen=1;
        int toplam=0;
        // for (int i = 1; i <=sayi ; i++) {
        //     if (sayi%i==0){
        //         System.out.println(sayi+" sayisi "+i+" sayisina tam bolunur");
        //         toplam+=i;
        //     }
        // }
        // System.out.println(toplam);
        do {
            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi "+bolen+" sayisina tam bolunur");
                toplam+=bolen;//toplam=toplam+bolen;
            }
            bolen++;}while (bolen<=sayi);
        System.out.println("toplam deger : "+toplam);
    }
}
