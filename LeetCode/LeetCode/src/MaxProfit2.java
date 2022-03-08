/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
	Design an algorithm to find the maximum profit. You may complete as 
	many transactions as you like (ie, buy one and sell one share of the 
	stock multiple times). However, you may not engage 
	in multiple transactions at the same time (ie, you must 
	sell the stock before you buy again).
 */
public class MaxProfit2 {

	public static void main(String[] args){
		
		int[] nums={100, 180, 260, 310, 40, 535, 695};
		System.out.println(maxProfit(nums));
	}
	static int maxProfit(int[] prices) {
		
		int profit=0;
		
		int i=0;
		
		while(i<prices.length){
			
			while(i<prices.length && prices[i+1]<=prices[i])
				i++;
			
			int buy=i++;
			
			while(i<prices.length && prices[i-1]<=prices[i])
				i++;
			
			int sell=i-1;
			
			profit+=(prices[sell]-prices[buy]);
		}
		return profit;
    }
}
