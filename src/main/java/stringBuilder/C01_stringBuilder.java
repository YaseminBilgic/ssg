package stringBuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder("animal");
        // System.out.println(sb.capacity());//22
        // sb.append("s hungry");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        // StringBuilder sb1=new StringBuilder();
        // sb1.append("animal");
        // System.out.println(sb1.capacity());
        // System.out.println(sb1.length());

        StringBuilder sb2=new StringBuilder(5);
        System.out.println(sb2.capacity());
        sb2.append("ahmet hoca java anlatiyor");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

    }
}
