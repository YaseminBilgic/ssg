package mda03;

import java.util.Arrays;

public class C06_mda {
    public static void main(String[] args) {

          /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int [][] sayilar= {{7,8,10},{15,95,65,23},{42,80,120,67,53},{121,100,15,25,60}};
        for (int a[]:sayilar//foreach sayesinde arrayleri tek katli array'e donusturdum
        ) {
            Arrays.sort(a);
            System.out.print(a[a.length - 1]+" ");
        }
        //System.out.println(Arrays.deepToString(sayilar));

    }
}
