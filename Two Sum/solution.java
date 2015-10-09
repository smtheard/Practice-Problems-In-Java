class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
        	for(int j = 0; j < nums.length; j++){
        		if(nums[i] + nums[j] == target && i != j){
        			arr[0] = i + 1;
        			arr[1] = j + 1;
        			return arr;
        		}
        	}
        }
        return arr;
    }

	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int[] result = twoSum(arr,9);
		System.out.println(result[0] + " " + result[1]);
	}
}