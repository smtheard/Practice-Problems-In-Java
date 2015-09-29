import java.util.*;

class Solution {
	public static void mergeSort(int array[], int start, int end) {
        int middle, left, right, temp;
        if (start < end) {
            middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            left = start;
            right = middle + 1;
            while (left <= middle && right <= end) {
                if (array[left] > array[right]) {
                    temp = array[right];
                    for (int i = right - 1; i >= left; i--) {
                        array[i + 1] = array[i];
                    }
                    array[left] = temp;
                    right++;
                    middle++;
                }
                left++;
            }
        }
    }

	public static boolean containsDuplicate(int[] nums) {
		if(nums.length < 2)
			return false;
		mergeSort(nums, 0, nums.length - 1);
		for(int i = 0; i < nums.length - 1; i++)
			if(nums[i] == nums[i + 1])
				return true;
        return false;
    }

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 2, 5};
		System.out.println(containsDuplicate(arr)); //true
		int arr2[] = {1, 2, 1, 3, 5, 5};
		System.out.println(containsDuplicate(arr2)); //true
		int arr3[] = {0, 1, 2};
		System.out.println(containsDuplicate(arr3)); //false
	}
}