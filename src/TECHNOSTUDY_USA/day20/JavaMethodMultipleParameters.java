package TECHNOSTUDY_USA.day20;

public class JavaMethodMultipleParameters {

    public static void main(String[] args) {
        printNAmeAndAge("John", 28);
        printNAmeAndAge("Sarah", 25);
    }

    public static void printNAmeAndAge(String name, int age) {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

    }
}
