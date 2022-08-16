package TECHNOSTUDY_USA.day14;

public class JavaForLoopEx1 {

    public static void main(String[] args) {

        // to get last value of i
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
