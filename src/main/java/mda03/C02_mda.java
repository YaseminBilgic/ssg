package mda03;

public class C02_mda {
    public static void main(String[] args) {

           /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int [][] sayilar= {{7,8,10},{15,65,23},{42,67,53}};
        elementYazdir(sayilar);


    }

    public static void elementYazdir(int[][] sayilar) {
        for (int[] a:sayilar
        ) {
            for (int b:a
            ) {
                System.out.print(b+" ");
            }
            System.out.println("\n******************************");
        }

    }
}
