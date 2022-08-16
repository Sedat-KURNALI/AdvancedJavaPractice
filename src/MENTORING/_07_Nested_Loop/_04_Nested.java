package MENTORING._07_Nested_Loop;

public class _04_Nested {


    public static void main(String[] args) {

        // A
        // B B
        // C C C
        // D D D D
        // E E E E E
        // F F F F F F

      int harf = 65;

        for (int i = 0; i <=5 ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+i)+ " ");

            }
         //   harf++;
            System.out.println();
        }

    }
}
