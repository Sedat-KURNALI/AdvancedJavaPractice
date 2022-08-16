package TechProEd2021._01_JavaTechProEd.day02_scanner;

import java.util.Scanner;

public class C2_Scanner {
    public static void main(String[] args) {

        // kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin


            Scanner scan= new Scanner(System.in);
            System.out.println("alanini hesaplamak icin dairenin yaricapini girin");

            // kullanicidan yaricap istedim,
            // once kullanicinin girdigi yaricapi icine koyabilecegim bir degisken olusturmaliyim

            double yaricap = scan.nextDouble();


            System.out.println("dairenin alani= " + 3.14 *yaricap*yaricap);
            scan.close();



    }
}
