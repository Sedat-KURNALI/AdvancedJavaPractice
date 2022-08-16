package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_14 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        for (int satir = 1; satir <= 5; satir++) {

            int x=satir;

            for (int sutun = 1; sutun <= satir; sutun++)
            {
                System.out.print(x + " ");
                x = x + (5- sutun);

            }

            System.out.println();
        }





    }
}
