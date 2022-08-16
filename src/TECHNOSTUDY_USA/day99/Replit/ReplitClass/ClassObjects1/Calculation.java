package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects1;

public class Calculation {

    public static int average(int number1, int number2, int number3) {
        return (number1 + number2 + number3) / 3;
    }

    public static String examResult(int num) {
        String result = "";
        if (num <= 100 && num >= 90) {
            result = "A++";
        } else if (num < 90 && num >= 70) {
            result = "A";
        } else if (num < 70 && num >= 60) {
            result = "B++";
        } else if (num < 60 && num >= 50) {
            result = "B";
        } else if (num < 50 && num >= 40) {
            result = "C";
        } else if (num < 40 && num >= 0) {
            result = "F";
        } else {
            result = "This is not a valid input";
        }
        return result;
    }

}



