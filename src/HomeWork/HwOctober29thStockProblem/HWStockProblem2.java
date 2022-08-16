package HomeWork.HwOctober29thStockProblem;

public class HWStockProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //    Best Time to Buy and Sell Stock II
//	    Say you have an array for which the ith element is the price of a given stock on day i.
	//
//	    Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
	//
//	    Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
	//
//	    Example 2:
	//
//	    Input: [1,2,3,4,5]
//	    Output: 4
//	    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//	    Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//	    engaging multiple transactions at the same time. You must sell before buying again.
//	    
		
		int prices[]= {1,2,3,4,5};
		int min=Integer.MAX_VALUE;
		int max=prices[0];
		int profit=0;
		
		for (int i=0; i<prices.length;i++) {
			if(max<prices[i]){
				max=prices[i];
			}
					
		}
		
		for (int i=0; i<prices.length;i++) {
			if(min>prices[i]){
				min=prices[i];
			}
					
		}

		System.out.println(max);
		System.out.println(min);
		profit=max-min;
		System.out.println(profit);
      
		}
}

