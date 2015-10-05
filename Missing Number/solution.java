class Solution {
	public static int missingNumber(int[] nums) {
		int i;
        for(i = 0; i < nums.length; i++){
        	if(i != nums[i]){
        		return i;
        	}
        }
        return i;
    }
	public static void main(String[] args) {
		int[] arr = {0, 1, 3};
		System.out.println(missingNumber(arr)); //2
		int[] arr2 = {0, 1, 2, 3, 5, 6};
		System.out.println(missingNumber(arr2)); //4
		int[] arr3 = {0};
		System.out.println(missingNumber(arr3)); //1
		int[] arr4 = {1, 0};
		System.out.println(missingNumber(arr4)); //2

	}
}