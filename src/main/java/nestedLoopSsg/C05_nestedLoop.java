package nestedLoopSsg;

import java.util.Arrays;

public class C05_nestedLoop {

    public static void main(String[] args) {
          /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */
        int arr[][][]={   {    {1, 2}, {3, 4}},{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}  };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int satir=5;
        for (int bulSatir = 1; bulSatir <=satir ; bulSatir++) {//satir
            for (int j =1; j<=satir-bulSatir  ; j++) {//sutun
                System.out.print("* ");
            }
            for (int i = 1; i <=bulSatir ; i++) {
                System.out.print(". ");
            }
            System.out.println();

        }

    }
}
