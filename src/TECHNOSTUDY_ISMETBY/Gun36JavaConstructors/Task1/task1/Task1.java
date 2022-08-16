package TECHNOSTUDY_ISMETBY.Gun36JavaConstructors.Task1.task1;


public class Task1 {
    public static void main(String[] args) {

        Book book1 = new Book("words", 1960, "veli");

        Book book2 = new Book("lıght", 1990);

        Book book3 = new Book("cin ali");

        Book book4 = new Book();

        book1.showInfo();
        book2.showInfo();
        book3.showInfo();

        System.out.println(book1);//book1 in çıktılarını stringe çevirilmiş hali olan toString
        System.out.println(book2);
        System.out.println(book3);
    }
}
