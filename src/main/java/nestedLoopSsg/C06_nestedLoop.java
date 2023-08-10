package nestedLoopSsg;

import java.util.Scanner;

public class C06_nestedLoop {

    public static void main(String[] args) {
         /*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("ilerlemek istediginiz harfi giriniz");
        char str=scan.next().charAt(0);

        for (char i = 'A'; i <=str ; i++) {//satir
            for (char j = 'A'; j <=i ; j++) {//sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
