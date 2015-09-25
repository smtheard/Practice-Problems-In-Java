import java.util.*;

class Solution {
	public static int[] singleNumber(int[] nums) {
		//idea to merge sort first, then return the elements that appear once
        int arr[] = {3, 5};
        return arr;
    }

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 2, 5};
		int[] result = singleNumber(arr);
		System.out.println(result[0] + " " + result[1]); //{3, 5}
	}
}