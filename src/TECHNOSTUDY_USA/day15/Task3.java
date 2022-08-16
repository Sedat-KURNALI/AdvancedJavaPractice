package TECHNOSTUDY_USA.day15;

public class Task3 {
    public static void main(String[] args) {
        //TODO
        // Write program using nested loops that prints:
        // *
        // **
        // ***
        // ****
        // *****

        /*
        in first line, inner loop should run one time. so inner loop will run until outer loops variable i,
wile defining inner loop condition, i used outer loop variable
when outer loop is 1, inner loop makes only one loop, when outer loop is 2, inner loop makes 2 loop and so on
         */

        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++) {
                if(col <= row) {
                    System.out.print( "*" );
                }
            }

            System.out.println();
        }
    }
}




