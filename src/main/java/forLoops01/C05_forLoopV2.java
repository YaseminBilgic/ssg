package forLoops01;

import java.util.Scanner;

public class C05_forLoopV2 {

    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
         girilen sayidan baslayarak -50' kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi<=100&&sayi>=-50){
            for (int i = sayi; i >-50 ; i--) {
                if (i%3==0){
                    System.out.print(i+" ");
                }
            }
        }else System.out.println("lutfen gecerli bir tamsayi giriniz");
    }



}
