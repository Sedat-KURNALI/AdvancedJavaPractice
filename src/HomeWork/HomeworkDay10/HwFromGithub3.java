package HomeWork.HomeworkDay10;



public class HwFromGithub3 {
    //Find the Largest Number Among Three Numbers using user Input
//to find largest number among three numbers using nested if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//int num1 = 10, num2 = 20, num3 = 7;
    //output 20 is the largest Number

    public static void main(String[] args) {
        int a = 34;
        int b = 45;
        int c = 78;

        if(a>=b){
            if(a>= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
        else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }

        int num1=10;
        int num2=20;
        int num3=7;
        if(num1>=num2){
            if(num1>=num3){
                System.out.println(num1+ "is the largest number");
            }
            else
                System.out.println(num3 + "is the largest number");
        }
        else{
            if(num2>=num3)
                System.out.println(num2+"is the largest number");
            else
                System.out.println(num3 + "is the largest number");

        }





    }
}
