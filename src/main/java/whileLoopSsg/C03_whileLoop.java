package whileLoopSsg;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);
        int toplam=0;

        //for (int i =0; toplam <=500 ; toplam+=i) {
        //    System.out.println("lutfen toplamak istediginiz sayilari ardi ardina giriniz");
        //    i=scan.nextInt();
        //}
        while (toplam<=500){
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin, toplam : "+toplam+" oldu");

    }
}
