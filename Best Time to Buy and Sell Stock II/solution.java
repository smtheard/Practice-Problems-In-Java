class Solution {
    public static int maxProfit(int[] prices) {
    	int min = 0;
    	int max = 0;
        for(int i = 0; i < prices.length; i++){
        	if(prices[i] > max)
        		max = prices[i];
        	if(prices[i] < min)
        		min = prices[i];
        }
        return max - min;
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
        System.out.println(maxProfit(arr)); //13
	}
}