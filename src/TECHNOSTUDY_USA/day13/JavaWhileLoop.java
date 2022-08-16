package TECHNOSTUDY_USA.day13;

public class JavaWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        while (i<5) { // 5<5 =false
            System.out.println("Hi" + i++);
            //i++; also we can write here
        }
        System.out.println("after the loop value of i:" +i);
    }

}
