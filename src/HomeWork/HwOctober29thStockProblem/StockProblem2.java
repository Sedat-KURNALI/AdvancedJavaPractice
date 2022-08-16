package HomeWork.HwOctober29thStockProblem;

public class StockProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   Input: [7,1,5,3,6,4]
//				    Output: 7
//				    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//				    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	
		
	   int [] items= { 7,1,5,3,6,4};
	   int profit=0;
	   
	
	   for (int i=0; i<items.length-1;i++) {
		   if(items[i+1]>items[i]) {
		  
		 
		   
		   profit+=(items[i+1]-items[i]);
	   }
	   } 
		   System.out.println(profit);
	   } 
	   }


 

	



