package TechProEd2021._03_Odev.Hafta_06;

public class _01 {
    public static void main(String[] args) {

        /*
        Soru 1 :
		Stringi ters çevirmek için bir Java Programı yazın
        1.Yol: StringBuilder () kullanarak
        2.Yol: String Classini kullanarak
        3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
        */

        //1.Yol: StringBuilder () kullanarak
        StringBuilder sb = new StringBuilder("haluk");
        System.out.println(sb.reverse());

        //2.Yol: String Classini kullanarak
        String text = "haluk";
        String tersText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            tersText = tersText + text.charAt(i);
        }
        System.out.println("text in tersi : " + tersText);

        //3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
        ters();
        System.out.println("text in tersi : " + tersText);
    }
    private static void ters() {
        String text = "haluk";
        String tersText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            tersText = tersText + text.charAt(i);
        }
    }
}
