package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_11 {

    public static void main(String[] args) {

//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******

        for (int satir = 1; satir <= 7; satir++) {
            // bosluk icin
            for (int bosluk = 1; bosluk <= 7 - satir; bosluk++)//sola dayalı olması için bu for yoruma alınmalı
                System.out.print(" ");

            // '*' icin
            for (int sutun = 1; sutun <= satir; sutun++) {
                // kenarlarda "*" yazmak icin
                if (satir == 7 || sutun == 1 || sutun == satir)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
