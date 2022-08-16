package HomeWork.Homeworkday15;

import java.util.Random;

public class HwOctober26thArrays {

	public static void main(String[] args) {
		
		 // Task
	    // 1. Return the number of even ints in the given array.
	   
		
		Random rand= new Random();
		
		int [] arr = new int [20];
		int evenCounter=0;
		for (int i =0; i<arr.length;i++) {
			
			
			arr[i]=rand.nextInt(20);
			
			if(arr[i]%2==0) {
				
				System.out.println( "  it is an even number" + arr[i]);
				evenCounter++;
	
	}
		}
			
			System.out.println( "the number of even numbers in your array: " + evenCounter);
		}
		}

//
//		int[] evens = {13, 14, 15, 20, 21};
//        int counter = 0;
//        for (int i = 0; i < evens.length; i++) {
//            int e = evens[i];
//            if (e % 2 == 0) {
//                counter++;
//            }
//        }
//        System.out.println("the number of even numbers in your array: " + counter);
//}
//}