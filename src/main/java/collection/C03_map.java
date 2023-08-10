package collection;

import java.util.HashMap;

public class C03_map {
    public static void main(String[] args) {

        HashMap<Integer,Book> map1=new HashMap<>();
        Book book=new Book();
        book.ismi="Ali Can Java Ogreniyor";
        book.yazar="Furkan";
        book.cikistarihi="2023";
        book.yayinEvi="TechProEd";
        map1.put(1,book);
        System.out.println(map1);

    }
}
