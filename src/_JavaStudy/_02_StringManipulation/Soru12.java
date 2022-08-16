package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {

        /* String parametreli bir metod yazin ve  girililen String icindeki digitlerin toplamini dondursun.
         * Ornek
         * input : ade1r4d3 output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */
/*
		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));  //4400

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2)); // 100200

	        */


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir string giriniz :");
        String yazi=scan.nextLine();

        sumOfDigit(yazi);

        scan.close();
    }

    public static void sumOfDigit(String str) {

        int sum  =0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum+= Integer.valueOf(""+str.charAt(i));
            }

        }
        System.out.println("girilen string deki sayilarin toplami :"+ sum);
    }


}
