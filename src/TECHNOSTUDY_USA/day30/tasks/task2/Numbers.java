package TECHNOSTUDY_USA.day30.tasks.task2;

import java.util.ArrayList;

public class Numbers {

    //int n;

    public boolean checkEvenNumber(int n) {
        return n % 2 == 0;
    }


    public ArrayList<Integer> evenNumbers (){
        ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i <=20 ; i++) {
                if (checkEvenNumber(i));
            result.add(i);
            }
        return result;
    }

}
