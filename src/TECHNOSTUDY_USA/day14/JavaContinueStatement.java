package TECHNOSTUDY_USA.day14;

public class JavaContinueStatement {
    public static void main(String[] args) {

        for (int i =0  ; i<5 ; i++ ){
            if (i<2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End of code");
/*
String text = "Stay at home";

        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt( i );

            if(letter == ' ') {
                continue;
            }

            System.out.print( letter );
        }

        System.out.println( "end of code" );
 */
    }
}



