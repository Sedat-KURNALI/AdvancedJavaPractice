package TECHNOSTUDY_USA.day14;

import java.util.Scanner;

public class Task4 {
// Determine and print the number of times
    // the character ‘a’ appears in the input entered by the user.

    // input: Test output
    //        a: 0

    // input: Ola amigo
    //        a:2

    //hint: .charAt, lenght(), for, index, counter,
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Provide a text: ");
        String str = input.nextLine();
char char_a =' ';
int counter =0;
int length_str = str.length();

        for(int index = 0; index < length_str; index++){
                 char_a = str.charAt(index);

                if(char_a =='a'){
                    counter = ++counter;
                    System.out.println(counter);
                    System.out.println(str);
                }
            }
        System.out.println("'a' appears in the text " +counter +" times");
        }

    }

