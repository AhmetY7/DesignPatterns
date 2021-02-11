package compositeex1;

public class Main {

    public static void main(String[] args) {
	    Chapter book = new Chapter("Programlamaya giriş");
	    Chapter chapter1 = new Chapter("Giriş");
	    chapter1.Add(new Text("hello, world"));
	    chapter1.Add(new Text("diğer programlar"));
        Chapter chapter12 = new Chapter("Temel Programlama");
        chapter12.Add(new Text("değişkenler"));
        chapter12.Add(new Text("kontrol"));
        chapter12.Add(new Text("döngüler"));
        chapter12.Add(new Text("fonksiyonlar"));

        Chapter chapter2 = new Chapter("Değişkenler");
        chapter2.Add(new Picture("değişken.jpg"));
        chapter2.Add(new Picture("int, double, float, boolean"));

        book.Add(chapter1);
        book.Add(chapter2);

        print(book);
        System.out.println();
        print(chapter12);
    }

    public static void print(Content content) {
        content.Operation();
    }
}
