package TECHNOSTUDY_USA.day32.tasks.task2;

public class Counter {
    //class member
    private static int count = 0;


    public Counter (){
        count++;
    }

    public String toString(){

        return "\nCount: "+count;
    }


}
