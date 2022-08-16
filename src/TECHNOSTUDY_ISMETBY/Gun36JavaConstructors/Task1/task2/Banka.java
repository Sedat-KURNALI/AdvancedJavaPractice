package TECHNOSTUDY_ISMETBY.Gun36JavaConstructors.Task1.task2;

public class Banka {
    String name;
    int customer;
    String adress;

    public Banka(String name, int customerr, String adress) {
        this.name = name;
        this.customer = customerr;
        this.adress = adress;
    }

    public Banka(String name, int customer) {
        this(name, customer, "");
    }

    public Banka(String name) {
        this(name, 0, "");
    }

    public Banka() {
        this("", 0, "");
    }

    // toString methodu...
    public String toString() {
        return "adı : " + name + " " + "müşteri sayısı : " + customer + " " + "adres : " + adress;
    }

}
