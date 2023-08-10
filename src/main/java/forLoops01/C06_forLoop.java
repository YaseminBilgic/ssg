package forLoops01;

public class C06_forLoop {

    public static void main(String[] args) {
        /*
        Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
         */
        String str="Java Guzeldir";//J v g u z e l d i r
        String bosStr;
        for (int i = 0; i < str.length(); i++) {
            bosStr=str.substring(i,i+1);
            if (str.indexOf(bosStr)==str.lastIndexOf(bosStr)){
                System.out.print(bosStr);
            }


        }
    }



}
