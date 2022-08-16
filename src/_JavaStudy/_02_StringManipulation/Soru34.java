package _JavaStudy._02_StringManipulation;

public class Soru34 {
    public static void main(String[] args) {
		/*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
*/
        String input= "Hersey guzel olacak" ;

        //1.Yol: StringBuilder ()

        StringBuilder str = new StringBuilder();
        str.append(input);
        String reverseInput= str.reverse().toString();
        System.out.println("1.yol :" + reverseInput);


        //2.Yol: String Class

        System.out.print("2.yol :");
        for (int i = input.length()-1; i >= 0; i--) {

            System.out.print(input.charAt(i));
        }
        System.out.println();

        //3.Yol: Bir method olusturma
        inputTersArray (input);

    } //main sonu

    public static void inputTersArray(String input) {

        System.out.print("3.yol :");

        char [] arr = input.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }

    }

} //class sonu

