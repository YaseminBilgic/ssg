package forLoops01;

import java.util.Scanner;

public class C03_forLoop {

    public static void main(String[] args) {
        /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(sayi+"X"+i+" = "+sayi*i);
        }

    }

}
