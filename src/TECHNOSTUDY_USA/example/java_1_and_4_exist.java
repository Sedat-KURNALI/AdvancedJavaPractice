package TECHNOSTUDY_USA.example;

import java.util.Scanner;

public class java_1_and_4_exist {
    public static void main(String[] args) {

                // code start here

                Scanner scan = new Scanner(System.in);

                String str1 = scan.nextLine();

                String[] arr1 = str1.split(" ");

                int[] intArr = new int[arr1.length];

                int count = 0;

                for(int i = 0 ; i < intArr.length ; i++){

                    int i1 = Integer.parseInt(arr1[i]);

                    intArr[count] =i1;

                    count++;
                }

                // your code start here
                // use intArr

                boolean oneexist = false;
                boolean fourexist = false;
                for (int i2 = 0; i2 < intArr.length; i2++) {
                    if (intArr[i2] == 1) {
                        oneexist = true;
                    }
                    if (intArr[i2] == 4) {
                        fourexist = true;
                    }
                }
                        if (oneexist && fourexist) { // 1 ve 4 varsa true&&true = true, print false
                         // 0 && 0= 0, 1 && 0 = 0 , 0 && 1 = 0, 1 && 1 = 1
                            System.out.println(false);
                        }else{
                            System.out.println(true); // yalniz 1 veya 4 varsa false, print true
                }








            }
        }


