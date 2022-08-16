package TECHNOSTUDY_ISMETBY.Gun36JavaConstructors.Task1.task2;

public class Task2 {
    public static void main(String[] args) {
        Banka bank1 = new Banka("A bank", 1000, "istanbul");

        Banka bank2 = new Banka("B bank", 200);

        Banka bank3 = new Banka("abank");

        System.out.println(bank1);//book1 in çıktılarını stringe çevirilmiş hali olan toString
        System.out.println(bank2);
        System.out.println(bank3);
    }
}

