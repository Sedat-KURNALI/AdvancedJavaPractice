package TECHNOSTUDY_USA.day13;

public class Ex1 {

    public static void main(String[] args) {
        // Sum numbers between 0 and 5
    int result = 0;

    int i = 0;

    while (i<5){ //5<5 is not true so while loop terminate.
        result = result +i;
        System.out.println("number: "+i);
        ++i; //pre increment
    }
        System.out.println("result: "+result);
    }
}
