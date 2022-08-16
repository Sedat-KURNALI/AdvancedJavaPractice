package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cart c = new Cart();

        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        c.userName = username;
        String item1 = scan.nextLine();
        String item1Price = scan.nextLine();
        c.addItem(item1, item1Price);

        String item2 = scan.nextLine();
        String item2Price = scan.nextLine();
        c.addItem(item2, item2Price);

        String item3 = scan.nextLine();
        String item3Price = scan.nextLine();
        c.addItem(item3, item3Price);

        System.out.println(c);

    }
}
/*
Class Main {
Create scanners for username, items and itemPrices. <<<OK>>>
Add the items and itemPrices to LinkedHashMap from Cart class. <<<OK>>>
Print your object <<<OK>>>
For _duzenle.TECHNOSTUDY_USA.example: <<<OK>>>
 username = Junior <<<OK>>>
 item1 -- Eggs     item1Price -- $3.19
 item2 -- Bread    item2Price -- $5.23
 item3 --  Water   item3Price -- $6.23
Print should be as <<<OK>>>
User name is : James <<<OK>>>
All elements are :{Eggs=$3.19, Bread=$5.23, Water=$6.23} <<<OK>>>
Total price : 14.65 <<<OK>>>
}


 David

Laptop
$1100.00

HeadPhone
$300.00

Sofa
$450.00

 */