package TECHNOSTUDY_USA.day8;

public class JavaAssignmentOperators {
    public static void main(String[] args) {
        /*

+=
Addition assignment
i+=5;
i=i+5

-=
Subtraction assignment
j-=10;
j=j-10;

*=
Multiplication assignment
k*=2;
k=k*2;

/=
Division assignment
x/=10;
x=x/10;

%=
Remainder assignment
a%=4;
a=a%4;

     */

        // += Addition assignment
        int i = 0;
        //i = i + 5;
        i+=5;      // line 7 and 8 doing the same things
        System.out.println( "i+=5 is: " +i);

        // -= Subtraction assignment
        int j = 0;
        j -= 10; // j =j-10
        System.out.println("j-=10:" +j);

        // *= Multiplication assignment
        int k = 4;
        k *= 2; //k = k*2
        System.out.println("k*=2 is: " +k);

        // /= Division assignment
        int t = 50;
        t /= 10; // t = t/10
        System.out.println("t/=10 is: "+t);

        // %= Remainder assignment
        int a = 16;
        a %= 4; // a = a & 4;
        System.out.println("a%=4 is: " +a);
    }
}
