package ternarySsg;

import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {

           /*
        kullanicidan iki tane sayi aliniz ve aldiginiz sayilarin toplami carpimi geciyorsa
        eger fazlalikli sayi yaziniz degisle eger fazlaliksiz sayi yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double toplam=sayi1+sayi2;
        double carpim=sayi1*sayi2;
        Object str1=123+"ahmet";
        Object str=toplam>carpim?toplam*carpim:"fazlaliksiz sayi";//object tum variable'larin atasi oldugu icin tum variabla'larida kapsadigi icin hata almadik
        System.out.println(str);
        System.out.println(str1);



    }
}
