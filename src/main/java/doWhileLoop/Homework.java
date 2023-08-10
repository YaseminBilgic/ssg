package doWhileLoop;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //4. uslu sayi bulabilen java kodu yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Üssü Alınacak Bir Sayı Giriniz :");
        int n=scan.nextInt();
        System.out.println("Lütfen Üs Olacak Bir Sayı Giriniz :");
        int k=scan.nextInt();
        //Mesela 5^4= 5*5*5*5 =625 yazmalı o zaman bir döngü oluşturmalıyım çünkü n yi k kadar çarpcam
        //Bu döngü 4 kere çalışacaktır.
        int sonuc=1;
        int i =1;
        do {
            sonuc= sonuc * n ;
            System.out.println(i+ " . Kuvveti =" +sonuc);
            i++;
        } while (i<=k);



/*
        int taban=5;
        int kuvvet=4;
        int sonuc=1;

            for (;kuvvet !=0; --kuvvet){
                sonuc*=taban;
                --kuvvet;
            }
        System.out.println("sonuc= "+sonuc);
 */

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Tabani Giriniz: ");
        int taban=scan.nextInt();
        System.out.println("Lütfen Kuvveti Giriniz: ");
        int kuvvet= scan.nextInt();
        int usluSayi=taban^kuvvet;
        int sonuc=(int) Math.pow(taban,kuvvet);
        do {
            for (int i = 0; i <= usluSayi; i++) {
                System.out.println(taban+ "^"+ kuvvet+ " = "+usluSayi);
            }

        }while (usluSayi>=);
        */
}
}
