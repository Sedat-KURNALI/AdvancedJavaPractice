package TECHNOSTUDY_USA.day29.tasks.task1;
//Part2
import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons = new ArrayList<>();

    //Part 4
    void takeLesson(Lesson lesson) {
        // calculate how many credits we have currently
        int currentTotalCredit = 0;
        for(Lesson lsn : lessons) {
            currentTotalCredit += lsn.credit;
        }
        // control maximum credit that student can have ***Part 5***
        if(currentTotalCredit + lesson.credit <= maxCredit) {
            lessons.add(lesson);
        } else {
            System.out.println("You've already taken to many lessons!!!");
        }

    }

}
