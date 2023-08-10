package doWhileLoop;

import java.util.Scanner;

public class C02_doLoop {

    public static void main(String[] args) {
        //2. Örnek
        //Girilen tamsayının basamaklarındaki sayilarin degerinin toplamını yazan program
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
        do {
            sayi= Math.abs(sayi);//mutlak deger aldim bu sayede sayilar pozitif oldu
            toplam+=sayi%10;//birler basamagini verdi
            sayi=sayi/10;//birler basamagi silindi 10'lar basamagi 1'ler basamagi oldu
        }while (sayi>0);
        System.out.println("basamak degerlerinin toplami : "+toplam);
    }
}
