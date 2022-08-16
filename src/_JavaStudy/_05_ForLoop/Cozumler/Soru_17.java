package _JavaStudy._05_ForLoop.Cozumler;

public class Soru_17 {

    public static void main(String[] args) {
// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

        for(int satir=0;satir<5;satir++)
        {
            for(int sutun=0;sutun<5;sutun++)
                System.out.print("#");

            System.out.println();
        }
    }
}
