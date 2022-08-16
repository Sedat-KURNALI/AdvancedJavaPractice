package TECHNOSTUDY_USA.day15;

public class Task2 {
    //using loop print multiplication table of 1
    // part1:
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    public static void main(String[] args) {
        //part1
        //for (int i = 1; i <=10 ; i++) {
          //  System.out.println("1 x "+i +" = "+1*i);
//part2
        for(int a = 1; a <= 10; a++) {

            for(int b = 1; b <= 10; b++) {

                int result = a * b;
                System.out.println( a + " x " + b + " = " + result );
            }
            System.out.println("------------------------------");
        }

    }

        }




