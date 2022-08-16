package HomeWork.Homeworkday15;


public class HwOctober26thArrays2 {

	public static void main(String[] args) {
		 // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
	    //    with a 2 somewhere later in the array.
		
		int[]arr= {1,1,5,6,8,2,9,2,2,2};
	
		  boolean arrayHasOne = false;
	        boolean arrayHasTwo = false;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 1) {
	                arrayHasOne = true;
	            }
	            if (arr[i] == 2) {
	                arrayHasTwo = true;
	            }
	        }
	        if (arrayHasOne) {
	            System.out.println("array has 1");
	        }
	        if (arrayHasTwo) {
	            System.out.println("array has 2");
	        }
	    
    if (arrayHasOne && arrayHasTwo) {
        System.out.println("array has 1 and 2");
    }

}
}
	
//Someone's Solution
//int counter = 0;
//int[] num = {4, 7, 9, 1, 5, 2, 3};
//for (int i = 0; i < num.length; i++) {
//    System.out.print(num[i] + "  ");
//}
//for (int i = 0; i < num.length; i++) {
//    if (num[i] == 1) {
//        counter++;
//    }
//    if (num[i] == 2) {
//        counter++;
//    }
//}
//if (counter == 2) {
//    System.out.println("\nThe array has both numbers 1 and 2");
//}
//}
//}
// Bayram's solution
//int count1 = 0;
//int count2 = 0;
//for (int j = 0; j < arr.length; j++) {
//    if (arr[j] == 1) {
//        count1++;
//    }
//    if (arr[j] == 2) {
//        count2++;
//    }
//}
//int comp=count1*count2;
//
//if(comp!=0){
//    System.out.println(" has 1 and 2");
//}
//else
//    System.out.println(" nothing here");
//}

// Dos' Solution
//boolean haveFive = false;
//for (int i = 6; i < 10; i++) {
//    if (i == 5) {
//        haveFive = true;
//    }
//}
//
//if(haveFive) {
//    System.out.println("you have 5 in array");
//}else{
//    System.out.println("you dont have");
//}