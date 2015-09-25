class Solution {
    public static int maxProfit(int[] prices) {
    	int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
        	if(prices[i] < prices[i + 1])
                profit = profit + (prices[i + 1] - prices[i]);
        }
        return profit;
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
        System.out.println(maxProfit(arr)); //13 in 3 trades
        int[] arr2 = {0, 10, 2, 20, 3, 3, 1, 1, 0, 1}; 
        System.out.println(maxProfit(arr2)); // 29 in 3 trades
        int[] arr3 = {0, 1};
        System.out.println(maxProfit(arr3)); // 1 in 1 trade
        int[] arr4 = {1, 0};
        System.out.println(maxProfit(arr4)); // 0
	}
}