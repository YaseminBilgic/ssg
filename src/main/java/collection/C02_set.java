package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C02_set {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<>();
        set1.add("Ilyas");
        set1.add("Kübra");
        set1.add("Lale");
        set1.add("Mukaddes");
        set1.add("Mustafa");
        set1.add("Mustafa");
        System.out.println(set1);
        TreeSet<String> set2=new TreeSet<>();
        set2.add("Ilyas");
        set2.add("Kübra");
        set2.add("Lale");
        set2.add("Mukaddes");
        set2.add("Mustafa");
        System.out.println(set2);
        LinkedHashSet<String> set3=new LinkedHashSet<>();
        set3.add("Ilyas");
        set3.add("Mukaddes");
        set3.add("Kübra");
        set3.add("Lale");
        set3.add("Mustafa");
        System.out.println(set3);

    }
}
