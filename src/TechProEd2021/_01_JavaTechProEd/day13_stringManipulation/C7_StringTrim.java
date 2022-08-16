package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

public class C7_StringTrim {
    public static void main(String[] args) {

    	// trim : stringin sadece ba��nda ve sadece sonundaki bo�luk karakterlerini temizler.

        String text="  Merhaba D�nya  ";

        System.out.println("text in orjinal hali = ->" + text +"<-"); //->  Merhaba D�nya  <-
        System.out.println("text in trim lenmi� hali = ->" + text.trim() +"<-"); //->Merhaba D�nya<-


    }
}
