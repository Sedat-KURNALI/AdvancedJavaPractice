package TECHNOSTUDY_USA.day32.nonAccessModifier.finalModifier;

public class main {

    public static void main(String[] args) {
        Person person1 =new Person("Ahmet", 10);
        //Person.name = "Hasan";
        System.out.println(person1.name);
        System.out.println(person1.fingerprintCode);
        //Person.name ="Veli";
        //person1.fingerprintCode = 20;

        //Person person2 = new Person("Mehmet", 11);
        //System.out.println(person2.name);
        //ystem.out.println(person2.fingerprintCode);
        System.out.println("-----------");
        //System.out.println(Person.name);
        System.out.println(person1.name);

    }
}
