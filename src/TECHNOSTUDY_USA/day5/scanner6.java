package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class scanner6 {

    public static void main(String[] args) {

        Scanner s2 = new Scanner(System.in);

        //Byte --> nextByte()
        System.out.println("How many ticket you want?");
        byte totalTicketCount = s2.nextByte();
        System.out.println("Answer for the ticket count:"+totalTicketCount);

        //Short --> nextShort();
        System.out.println("How many ticket you want?");
        short totalTicketCountinShort = s2.nextShort();
        System.out.println("Answer for the ticket count:"+totalTicketCountinShort);

        //Char --> We are not able to use char

        //float --> nextFlaot()
        System.out.println("How many ticket you want?");
        float singleTicket = s2.nextFloat();
        System.out.println("Single ticket price:"+singleTicket);
/*
String --> nextLine()
int --> nextInt()
boolean --> nextBoolean()
byte --> nextByte()
short --> nextShort()
float --> nextFloat()
double --> nextDouble
*/
        String username = "Samil";
        String lastname = "Balci";

        System.out.println("username + lastname");
        System.out.println(username + lastname);


/*Ali koklu codes
{

        Scanner s1 = new Scanner( System.in );

//      byte  ->> nextByte()  -128 -- 127

        System.out.println("how many tickets you want ");

        byte totalTicketCount = s1.nextByte();

        System.out.println("answer for the ticket count " + totalTicketCount);

//      short  --> nextShort()

        System.out.println("Total amount for the tickets");

        short ticketTotal = s1.nextShort();

        System.out.println("Total amount of your tickets "+ ticketTotal);

//      char  -->  we are not able to use the char

//      float -->  nextFloat()

        System.out.println("Single ticket price ");

        float singleTicket = s1.nextFloat();

        System.out.println("Single amount of your ticket " + "$ " + singleTicket);



/*
    Scanner class
           We are able to type in the console
                we can also print it

            String --> nextLine()
            int    --> nextInt()
            boolean --> nextBoolean()
            byte   --> nextByte()
            short  --> nextShort()
            float  --> nextFloat()


 */

//  String user name and string last name print it in the one line

      //  String name = "Ali";
      //  String lastName = "Koklu";

      //  System.out.println(name + " " + lastName);
      //  System.out.print(name + " " + lastName);
      //  System.out.println(12);



    }
}
