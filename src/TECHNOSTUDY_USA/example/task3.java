package TECHNOSTUDY_USA.example; //Ali.officeHour.Week3;

public class task3 {
/*
            TASK 4

               Create byte age
               if the age is 1
               print you can crawl

               if the age is 2
               print you can talk

               if the age is 3
               print you can walk

               if the age is 4
               print you should have some vaccines

               if the age is 5
               print you can start reading

               else go to school

               DO THIS WITH SWITCH STATEMENT

*/
public static void main(String[] args) {
    byte age = 6;
    String p = "";
    switch (age) {
        case 1:
            p = "you can crawl";
            break;
        case 2:
            p = "you can talk";
            break;
        case 3:
            p = "you can walk";
            break;
        case 4:
            p = "you should have some vaccines";
            break;
        case 5:
            p = "you can start reading";
            break;
        default:
            p = "go to school";
            break;
    }
    System.out.println(p);
    }


}

/*
            TASK 2
       char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
     */


