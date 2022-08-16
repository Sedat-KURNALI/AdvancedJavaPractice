package TECHNOSTUDY_USA.day19;

public class JavaMethods {

    public static void main(String[] args) { // start point or flag
        System.out.println("Step 1");
        printGoodMorning();

        System.out.println("Next Step");
        printGoodMorning();

        System.out.println("Another call of method");
        printGoodMorning();

        System.out.println("Yet Another");
        printGoodMorning();
        printGoodMorning();
        printGoodMorning();
    }
    //void is return type which returns nothing
    public static void printGoodMorning (){ // public static void=ReturnType printGoodMorning=NameOfTheMethod (PARAMETERS =input)
        //assume you have 100 lines of Code here
        System.out.println( "Good Morning!!!" );
    }
}
