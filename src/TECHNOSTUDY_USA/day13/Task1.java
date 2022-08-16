package TECHNOSTUDY_USA.day13;

public class Task1 {

    public static void main(String[] args) {

        // write a java program which calculate sum from 50 to 100;

        //part 2
        // ask user to provide a number;
        // calculate sum from 0 to provided number
        // ex: provided number 2
        // 0+1+2 => 3
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number:");
        int num = scan.nextInt();
        System.out.println("Your number is: "+num);

        int start = 0, total=0;

        while(start<=num) {
            System.out.println("Start adding:"+start);
            total += start;
            start++;
        }
        System.out.println("Sum of 0 to "+num +" is: "+total);
        /* */
        int counter = 50, result =0;

        while (counter<=100){
        System.out.println("Num:" +counter);
        result += counter; // result = result + counter;
          // 1.result= 0 +50;
        // 2.result= 50 +51;
        counter++;

}

        System.out.println("Sum of 50 to 100: "+result);

}

    }

