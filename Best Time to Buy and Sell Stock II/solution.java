class Solution {
    public static int maxProfit(int[] prices) {
    	int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
        	if(prices[i] < prices[i + 1]){
                profit = profit + (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
        System.out.println(maxProfit(arr)); //13 in three trades
	}
}