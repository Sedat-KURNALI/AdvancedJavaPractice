package TECHNOSTUDY_ISMETBY.Gun36JavaConstructors.Task1.task1;

public class Book {
    String name;
    int publisherYear;
    String autor;

    public Book(String name, int publisherYear, String autor) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.autor = autor;
    }

    public Book(String name, int publisherYear) {
        this(name, publisherYear, "");

    }

    public Book(String name) {
        this(name, 0, "");
    }

    public Book() {
        this("", 0, "");
    }

    // toString methodu...
    public String toString() {
        return name + " " + publisherYear + " " + autor;
    }

    public void showInfo() {
        System.out.println(name + " " + publisherYear + " " + autor);
    }

}

