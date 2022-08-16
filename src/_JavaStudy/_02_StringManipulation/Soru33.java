package _JavaStudy._02_StringManipulation;

public class Soru33 {
    public static void main(String[] args) {
		/*
		String name = "Emine";
		charAt yontemini kullanarak konsolda tum harfleri  yazdirin.

		*/
        String name="Emine";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+ "," );
        }


    }
}
