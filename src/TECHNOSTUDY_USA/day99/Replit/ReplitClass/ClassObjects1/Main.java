package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects1;

public class Main {

    public static void main(String[] args) {
        String lastResult = result (100,90,100);
        System.out.println(lastResult);
    }

    public static String result(int a, int b, int c) {
        int num = Calculation.average(a, b, c);
        String sResult = Calculation.examResult(num);
        String result = "";

        if (sResult.equals("A++")) {
            result = "Your result is good and it is A++ You passed Yeayyy";
        }else if (sResult.equals("A")) {
            result = "Your result is good and it is A You passed Yeayyy";
        }else if (sResult.equals("B++")) {
            result = "Your result is okay and it is B++ You passed Yeayyy";
        }else if (sResult.equals("B")) {
            result = "Your result is okay and it is B You passed Yeayyy";
        }else if (sResult.equals("C")) {
            result = "Your result could be better but you passed and it is C";
        }else if (sResult.equals("F")) {
            result = "Your result is Not good enough it is F . See you next year bro.";
        }else {
            result = "This is not a valid input";
        }
        return result;
    }
}

