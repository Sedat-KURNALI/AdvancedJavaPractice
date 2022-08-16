package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.FinalModifiers.Example3;

public class Ex3 {

    final String name;

    public Ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Ex3 ornek1 = new Ex3("ali");
        Ex3 ornek2 = new Ex3("ayse");

        // ornek1.name="ali"; final değişkeni olduğu için ilk değer ataması sonrası değiştirilemez
        // ornek2.name="ayse";  final değişkeni olduğu için ilk değer ataması sonrası değiştirilemez

        System.out.println("ornek1 = " + ornek1.name);
        System.out.println("ornek2 = " + ornek2.name);
    }
}
