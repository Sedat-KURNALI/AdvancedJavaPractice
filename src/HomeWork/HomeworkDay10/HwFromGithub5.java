package HomeWork.HomeworkDay10;


import java.util.Scanner;

public class HwFromGithub5 {

    //write a program that find the size.
    // user input integer and output the size of the clothes.

//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//
//            "size is not small, medium, large or X-large, but was "
public static void main(String[] args) {

    Scanner size=new Scanner(System.in);
    System.out.println("What is your size");
    int a=size.nextInt();

    switch (a){
        case 4:
            System.out.println("size is small");
            break;
        case 6:
            System.out.println("size is medium");
            break;
        case 10:
            System.out.println("Size is large");
            break;
        case 12:
            System.out.println("size is X-large");
            break;
        default:
            System.out.println("invalid");

    }
}
}


