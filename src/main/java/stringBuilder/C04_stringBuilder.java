package stringBuilder;

public class C04_stringBuilder {
    public static void main(String[] args) {
        String str="Learn java earn money";
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb);
        sb.reverse();

        str=sb.toString();
        System.out.println(str);
    }
}
