package TECHNOSTUDY_USA.day19;

public class JavaMethodParameterAndArgument {

    public static void main(String[] args) {
        printFullname("Dos", "Jan"); // Arguments "Dos", "Jan"
    }

    public static void printFullname(String name, String surname) { // Parameters name & surname
        System.out.println(name + " " + surname);
    }
}
