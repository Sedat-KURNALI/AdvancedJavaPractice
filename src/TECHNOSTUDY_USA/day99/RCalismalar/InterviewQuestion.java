package TECHNOSTUDY_USA.day99.RCalismalar;

import java.util.ArrayList;

public class InterviewQuestion {

    public static ArrayList<String> myFancyPants (int low ,int high ,int A ,int B){
        ArrayList<String> list = new ArrayList<>();

        for (int i = low; i <= high ; i++) {
            if ( i % A == 0 && i % B == 0) list.add("FancyPants");
            else if ( i % B == 0) list.add("Pants");
            else if ( i % A == 0) list.add("Fancy");
            else list.add(String.valueOf(i));
        }
        return list;


    }

    public static void main(String[] args) {

        System.out.println(myFancyPants(50, 80, 7, 5));
    }
    /*
    Create a method name is myFancyPants
Parameters are 4 integers (low , high , A , B)
Return type is ArrayList<String>

Note: low ,high , A , B positive numbers

Your method needs to count from low to high
If the number evenly divisible by A --> add Fancy to ArrayList
If the number evenly divisible by B --> add Pants to ArrayList
If the number evenly divisible by A and B --> add FancyPants to ArrayList

return ArrayList

Note : Low and High values both included

For _duzenle.TECHNOSTUDY_USA.example:
Low = 50
High = 80
A is 7
B  is 5

result should be

Pants
50
51
52
53
54
Pants
Fancy
57
58
59
Pants
61
62
Fancy
64
Pants
66
67
68
69
FancyPants
.....

     */
}
