package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    /*
    1- Create a method name as checkAge
      Parameter is: string(dateOfBirth)
      Return type is int
2- Compare today date to dateOfBirth .  Print the age
    for _duzenle.TECHNOSTUDY_USA.example:
    dateOfBirth equal to 02/20/2000
     return should be 20
     */

        public int checkAge(String dateOfBirth){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate dob = LocalDate.parse(dateOfBirth,formatter);
            LocalDate today= LocalDate.now();
            return Period.between(today,dob).getYears();
        }
/*
    public static int checkAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.now();
        LocalDate localDate = LocalDate.parse(dob, formatter);
        int yearDif = date.getYear() - localDate.getYear();
        System.out.println("Date of birth: "+localDate);
        return yearDif;
    }

    public static void main(String[] args) {
        String tempDate = "02 20 2000";
        int age = checkAge(tempDate);
        System.out.println("Age: "+age);
    }

 */
}






