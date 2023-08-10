package datetime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        /*
        soru 3)
        bize bugunun tarihini ve su anki saati dondurun
        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        bize 100 gun once 100 saat sonraki tarihi dondurun
        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        bize sadece bugunun tarihi dondurun
         */
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.withNano(0).withSecond(0));//2023-07-04T(time kismina gectigini gosterir)20:00:43.021002
        System.out.println(ldt.plusMonths(3).plusHours(100));
        System.out.println(ldt.minusDays(100).plusHours(100));
        System.out.println(ldt.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        System.out.println(ldt.toLocalDate());

    }
}
