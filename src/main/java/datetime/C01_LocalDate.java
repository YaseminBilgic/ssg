package datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class C01_LocalDate {
    public static void main(String[] args) {
        /*
        soru 1)
        -bugunun tarihini obje olusturarak yazdirin
        -bugun yilin kacinci gunu oldugunu yazdirin
        -hangi gunde oldugumuzu yazdirin
        -yılın bitmesine kac gun kaldıgını yazdırın
        -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        System.out.println(bugun.getDayOfYear());//185
        System.out.println(bugun.getDayOfWeek());
        System.out.println(365 - bugun.getDayOfYear());//180
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfWeek());

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen sirasiyla yil ay gun giriniz");
        int yil=scanner.nextInt();
        int ay=scanner.nextInt();
        int gun=scanner.nextInt();
        LocalDate tarih=LocalDate.of(yil,ay,gun);

        if (tarih.isBefore(bugun)){
            System.out.println(tarih);
        } else if (bugun.isBefore(tarih)) {
            System.out.println(bugun);
        }else System.out.println("ikiside ayni tarih : "+tarih);

    }
}
