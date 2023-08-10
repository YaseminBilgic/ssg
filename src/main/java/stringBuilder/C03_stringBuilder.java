package stringBuilder;

public class C03_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        StringBuilder sb1=new StringBuilder("Jave");
        // System.out.println(sb.equals(sb1));//true//equals == gibi davranir == adreslerine bakar her objenin adresi farkli olur bundan dolayi false
        // System.out.println(sb.toString().equals(sb1.toString()));//true
        // System.out.println(sb.equals(sb1.toString()));
        System.out.println(sb1.compareTo(sb));

    }
}
