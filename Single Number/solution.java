import java.util.*;

class Solution {

	public static int singleNumber(int[] nums) {
		HashMap hashMap = new HashMap();
		for(int i = 0; i < nums.length; i++){
			if(hashMap.containsValue(nums[i]))
				hashMap.remove(nums[i]);
			else{
				hashMap.put(i, nums[i]);
			}
		}

        return hashMap.get(0).hashCode();
    }

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 4, 3, 5, 6, 4, 5, 6};
		System.out.println(singleNumber(arr)); //3
		int arr2[] = {1};
		System.out.println(singleNumber(arr2)); //1
		int arr3[] = {1, 2, 3, 4, 1, 2, 3, 4, 5};
		System.out.println(singleNumber(arr3)); //5
	}
}