package TECHNOSTUDY_USA.day12;

public class JavaNestedIfStatement {

    public static void main(String[] args) {

        int age = 70;

        if (age>18){
            System.out.println("has permit to work");
            if (age > 60 ) {
                System.out.println("Too old to do some work");
            }

        }else {
            System.out.println("Too young to do anything");
        }
    }
}
