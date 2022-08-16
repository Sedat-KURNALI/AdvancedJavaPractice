package TECHNOSTUDY_USA.day32.tasks.task2;

public class task2 {

    public static void main(String[] args) {
        Counter c1 = new Counter(); //1
        System.out.println(c1);

        new Counter(); //2
        new Counter(); //3

        Counter c2 = new Counter(); //4
        System.out.println(c2);


    }
}
