class Solution {
	public static void moveZeroes(int[] nums) {
        int numZeroes = 0;
        for(int i = nums.length - 1; i > -1 ; i--){
            if(nums[i] == 0){
                for(int j = i; j < nums.length - 1; j++){
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - numZeroes - 1] = 0;
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