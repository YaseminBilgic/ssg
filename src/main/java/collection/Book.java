package collection;

public class Book {
    String yazar;
    String cikistarihi;
    String ismi;
    String yayinEvi;

    @Override
    public String toString() {
        return "Book{" +
                "yazar='" + yazar + '\'' +
                ", cikistarihi='" + cikistarihi + '\'' +
                ", ismi='" + ismi + '\'' +
                ", yayinEvi='" + yayinEvi + '\'' +
                '}';
    }
}
