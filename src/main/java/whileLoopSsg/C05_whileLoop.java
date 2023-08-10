package whileLoopSsg;

import java.util.Random;
import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int tahminSayisi=0;
        int kullaniciSayi=-1;

        while (kullaniciSayi!=sayi){
            System.out.println("lutfen tahminde bulunmak icin 0 ile 100 arasinda bir tamsayi giriniz");
            kullaniciSayi= scan.nextInt();

            if (kullaniciSayi>sayi){
                System.out.println("lutfen sayiyi kucultunuz");
            } else if (kullaniciSayi<sayi) {
                System.out.println("lutfen sayiyi buyultun");
            }
            tahminSayisi++;
        }
        System.out.println("bilgisayarin tuttu sayiyi "+tahminSayisi+". tahminde buldunuz");


    }
}
      //bunun kullaniciya 5 hak verip hakki biterse eger bulamadiniz oncesinde bulursa donguyu kıran bir dongü olusturun

