package mda03;

public class C05_mda {
    public static void main(String[] args) {

          /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
        int sayilar[][]={{1,2,3}, {4,5}, {6}};
        carpim(sayilar);

    }
    private static void carpim(int[][] sayilar) {
        int carpim1=1;
        for (int []a:sayilar
        ) {
            carpim1*=a[a.length-1];
        }
        System.out.println(carpim1);
    }
}
