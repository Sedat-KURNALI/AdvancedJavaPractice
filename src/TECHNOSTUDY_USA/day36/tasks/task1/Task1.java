package TECHNOSTUDY_USA.day36.tasks.task1;


import java.time.LocalDate;
import java.time.Period;

public class Task1 { //Tekrarda burada kaldik

    //Write a Java method to calculate the difference between two dates
    public Period differenceOfTwoDates(LocalDate date1, LocalDate date2) {
//        if(date1.isBefore(date2)) {
//            return Period.between(date1, date2);
//        } else {
//            return Period.between(date2, date1);
//        }

        /* Ali koklu beyden
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */
        return date1.isBefore(date2) ? Period.between(date1, date2) : Period.between(date2, date1);
    }



    public int getAge(LocalDate dob) {

        LocalDate today = LocalDate.now();
        return today.getYear() - dob.getYear();
    }

}