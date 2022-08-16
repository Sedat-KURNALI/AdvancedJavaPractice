package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ex1 {
    public static void main(String[] args) {
        int last_value_of_i = 0;

        for(int i = 0; i < 5; i++) {
            last_value_of_i = i;
        }
        System.out.println( last_value_of_i );
        for(int i=0; ; i++){ //infinite loop
            System.out.println("infinite: "+ i);
        }
    }
}
