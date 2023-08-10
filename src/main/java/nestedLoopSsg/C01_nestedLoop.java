package nestedLoopSsg;

public class C01_nestedLoop {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        //1.yol
        System.out.println("* * * * * *\n* * * * * *\n* * * * * *\n* * * * * *");
        System.out.println("-------------------------------------------");
        //2.yol
        for (int i = 0; i <4 ; i++) {
            System.out.println("* * * * * *");
        }
        System.out.println("-----------------------------------");

        for (int i = 0; i <4 ; i++) {//satir
            for (int j = 0; j <6 ; j++) {//sutun
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
