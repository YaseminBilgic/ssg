package forLoops01;

public class C02_forLoop {
    public static void main(String[] args) {
        /*
    Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
    virgul olarak ayni satirda yazdirin
        */
        int bas=10;
        int son=30;
        for (int i = bas; i <=son ; i++) {
            if (son>i){System.out.print(i+",");
            } else System.out.print(i);

        }

    }

}
