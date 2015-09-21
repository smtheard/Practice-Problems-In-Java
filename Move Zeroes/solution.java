class Solution {
	public static void moveZeroes(int[] nums) {
        int max = nums.length;
        int numZeroes = 0;
        for(int i = 0; i < max; i++){
            if(nums[i] == 0){
                nums[i] = nums[nums.length - numZeroes - 1];
                nums[nums.length - numZeroes - 1] = 0;
                max--;
                numZeroes++;
            }
        }
        return;
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " "); //[1, 3, 12, 0, 0]
	}
}