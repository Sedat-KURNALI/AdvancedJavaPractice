package HomeWork.HomeworkDay16;

public class HwOctober27thDimensionalArrays {

	public static void main(String[] args) {


 // part2. calculate average price of each item(apple, milk, meat, bread)
 // expected output is:
 // average price of apple is: ???
 // average price of milk is: ???
 // average price of meat is: ???
 // average price of bread is: ???


		
	
		int[][] prices= {
				{3,4,5},
				{3,3,3},
				{4,5,4},
				{1,1,2}
				};
		
		for(int i=0;i<prices.length;i++) {
			double sum=0;
			
			for(int j=0; j< prices[i].length;j++) {
				
			System.out.print(prices[i][j]+" ");	
				sum+=prices[i][j];
			}
			
			double avg= (double) sum/prices[i].length;
		System.out.println("Sum is:" + sum);
		System.out.println("Avg is: " + avg) ;
			
		System.out.println();
		}
	}
}
//		int[] stores= {"Walmart","Costco"."Corrados"};
//		int[] items= {"apple","milk","meat","bread"}
		
		

