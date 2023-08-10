package mda03;

public class C03_mda {
    public static void main(String[] args) {

        /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int [][] sayilar= {{7,8,10,55},{15,65,23,67,98},{42,67,53}};

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {//i outer indexi temsil eder
            for (int j = 0; j <sayilar[i].length ; j++) {//j inner indexi temsil eder
                if (i==j){
                    toplam+=sayilar[i][j];//toplam=toplam+sayilar[i][j];
                }
            }
        }
        System.out.println(toplam);

    }
}
