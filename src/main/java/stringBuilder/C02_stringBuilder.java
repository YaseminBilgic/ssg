package stringBuilder;

public class C02_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java guzeldir");
        sb.append("!");
        System.out.println(sb);

       // sb.insert(5,"cok ");
        // System.out.println(sb);

        String str="hava cok sıcak";
        sb.insert(5,str,5,9);
        System.out.println(sb);
    }
}
