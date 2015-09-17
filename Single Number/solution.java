import java.util.*;

class Solution {
	public static int singleNumber(int[] nums) {
		ArrayList<Integer> single = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++)
			if(single.contains(nums[i]))
				single.remove(single.indexOf(nums[i]));
			else
				single.add(nums[i]);
        return single.get(0);
    }

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 4, 3, 5, 6, 4, 5, 6};
		System.out.println(singleNumber(arr)); //3
		int arr2[] = {1};
		System.out.println(singleNumber(arr2)); //1
	}
}