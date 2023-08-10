package arrayArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_arrayList {
    public static void main(String[] args) {


    /*
  icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
  kullanicidan bir sayi isteyip
  listede var olup olmadigini kullaniciya yazin
   */
    Random rnd=new Random();
    // int sayi=0; //rnd.nextInt(1000);//0'la 1000 arasinda random sayi olusturur alt araligi 0'dir degistirilemez ust araligi kendimiz belirleriz int bound
    List<Integer> sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){
        int sayi= rnd.nextInt(1000);
        if (!sayiListesi.contains(sayi)){
            sayiListesi.add(sayi);
        }}
        System.out.println(sayiListesi);
    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tahminde bulumak icin bir sayi giriniz");
    int sayi1= scan.nextInt();
        if (sayiListesi.contains(sayi1)){
        System.out.println("dogru tahminde bulundunuz tebrikler");
    }else System.out.println("malesef bulamadiniz lutfen tekrar deneyiniz");


}
}
