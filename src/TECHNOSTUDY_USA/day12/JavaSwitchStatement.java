package TECHNOSTUDY_USA.day12;

import java.util.Random;

public class JavaSwitchStatement {

    public static void main(String[] args) {

        Random random = new Random();

        int day = 1 + random.nextInt(8); //0-7

        System.out.println();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:// else
                System.out.println("not a valid day number");
                break;
        }
    }
}
