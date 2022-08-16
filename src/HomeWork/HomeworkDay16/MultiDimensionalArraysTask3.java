package HomeWork.HomeworkDay16;

public class MultiDimensionalArraysTask3 {

	public static void main(String[] args) {
		String [] [] array= {
				{"apple", "lemon"," peach"},
				{"red","green","blue"}
		};

        //part1. print
        // apple lemon peach
        // red green blue
		
		// part 2, you have to use 2 loops and prin
		// // red green blue
		// apple lemon peach
//		for(int i=0 ;i<array.length; i++) {
//		
//			for(int j=0; j<array[i].length;j++) {
//				
//				System.out.print(array[i][j]+ " ");
//			}
//				System.out.println();
//		
//		}
//	}   [1][0]+[0][0]
		
//		[1][1]+[0][1]
//		[1][2]+[0][2]
//}

     for(int i=0; i<array.length-1;i++	) {      
	
	     for(int j=0; j<array[i].length;j++) {
	

		 System.out.println(array[i+1][j] + " " + array[i][j]);
	
		 System.out.println();
	}	
     }		
	

	}	
}

