import java.util.*;

class Solution {

	public static int[] mergeSort(int[] nums){
		int[] arr = {1, 1, 2, 2, 3, 5};
		return arr;
	}

	public static boolean containsDuplicate(int[] nums) {
		int[] sortedNums = mergeSort(nums);
		for(int i = 0; i < nums.length - 1; i++)
			if(sortedNums[i] == sortedNums[i + 1])
				return true;
        return false;
    }

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 2, 5};
		System.out.println(containsDuplicate(arr)); //true
	}
}