package HomeWork.HomeworkDay16;

public class HwOctober27thDimensionalArrays2 {

	public static void main(String[] args) {
		
//      walmart	costco	corrado's	AVG
// apple	3	       4	   5	     4
// milk	3	       3	   3	     3
// meat	4          5	   4	     4.33
// bread	1	       1	   2	     1.33
// TOTAL	11	      13	   14

 // given table,
 // part1. calculate sum of price in each market(walmart,costco,corrado's)
 // expected output is:
 // Total at Walmart is: ???
 // Total at costco is: ???
 // Total at corrado's is: ???
		
		int[] apple= {3,4,5};
		int[]milk= {3,3,3};
		int[]meat= {4,5,4};
		int[]bread= {1,1,2};
		
		
		
		int[][] items= {{3,4,5},{3,3,3},{4,5,4},{1,1,2}};
		//  [0][0]
		          
		//[1][0]
		//[2][0]
		//[3][0]
		for(int i=0; i< items.length-1;i++) {
			int sum=0;
		
			for(int j=0; j<=items[i].length; j++) {
				sum+=items[j][i];
			
			 
			 System.out.println(items[j][i]);
				
			 
			}
			System.out.println("Sum is: " + sum);
			
		}	
				
		
	}
	}

	

