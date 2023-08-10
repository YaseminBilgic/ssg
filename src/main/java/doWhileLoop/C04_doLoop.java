package doWhileLoop;

import java.util.Scanner;

public class C04_doLoop {
    public static void main(String[] args) {
        //negatif bir deger girilene kadar kullanicidan girisleri
        //kabul eden ve girilen degerlerden cift sayilari toplayan program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("sadece pozitif ve cift sayilari toplayan programa hosgeldiniz negatif sayi giresiye kadar calisacak");
        int sayi;
        int toplam=0;
        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                toplam+=sayi;
            }else System.out.println("sadece cift sayilari topluyoruz");
        }while (sayi>0);
        System.out.println("toplam deger : "+toplam);
        // while (sayi>0)
        // {
        //     System.out.println("lutfen bir sayi giriniz");
        //     sayi= scan.nextInt();
//
        // }

    }
}
