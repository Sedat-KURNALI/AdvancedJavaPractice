package HomeWork.HomeworkDay36;

public class HW {

	public static void main(String[] args) {
		//TODO TRY CATCH HOMEWORK
	    // 1. use string "HelloWorld" and get char at index 100
	    // 2. create array of size 10, create a loop from 0 to 100, and try to print every element in array
		
		String s="HelloWorld";
		
		char[]array=s.toCharArray();
		try {
		System.out.println(array[100]);

	}catch(Exception ArrayIndexOutOfBoundsException ) {
		System.out.println("You don't have that index");
	}

	
	
	     int[]num=new int[10];
	try {
	      for(int i=0;i<100;i++) {
	    	  System.out.println(num[i]);
	    	  
	      }
	}catch(Exception ArrayIndexOutOfBoundsException){
	    	  System.out.println("This is handled, too");
	      }
}
}
