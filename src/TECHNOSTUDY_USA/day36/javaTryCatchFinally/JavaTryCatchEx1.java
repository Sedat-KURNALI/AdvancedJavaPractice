package TECHNOSTUDY_USA.day36.javaTryCatchFinally;

public class JavaTryCatchEx1 {

    public static void main(String[] args) {
        /*
        int a = 5;
        int b = 0;
        int result = 0;

        try {
            result = a / b;
            System.out.println(result);
        } catch(Exception exception) {
            System.out.println("something gone wrong, please look to variables");
            System.out.println(exception);
            exception.printStackTrace();
            System.err.println("Error is here");
        } finally {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("result: " + result);
        }

        System.out.println("End of code");


         */
        int a = 11, b = 0, c = 0;

        try{ // try { false } catch { calisir }
             // try { istisna yoksa }
            c = a / b ;
            System.out.println(c);
        } catch (ArithmeticException e1) {
            System.out.println("Bir problem var, degiskenlerine yeniden bir gozat!");
            System.out.println(e1);
            e1.printStackTrace();
            System.err.println("Problem hala gecerli, there is an error!");
        } catch (Exception e2) {
            System.out.println("2. istisna bulundu, tekrar gozden");
        }
        finally {
            System.out.println( "\na: "+a
                    +"\nb: "+b
                    +"\nc: "+c );
        }
        System.out.println("***");
    }
}

