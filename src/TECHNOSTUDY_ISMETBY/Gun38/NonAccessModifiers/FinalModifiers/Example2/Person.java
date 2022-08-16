package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.FinalModifiers.Example2;

public class Person {
    String name;
    public final int fingerPrintCode;

    public Person(String name, int fingerPrintCode) {
        this.name = name;
        this.fingerPrintCode = fingerPrintCode;
    }

    // final değişkenlerine ilk değer atama işlemi direk
    // yapılabildiği gibi constructorla da atanabilir.
    // ancak daha sonra yine değeri değiştirilemez.
    // bu işlem ilk değer atama için geçerli.
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerPrintCode=" + fingerPrintCode +
                '}';
    }
}

