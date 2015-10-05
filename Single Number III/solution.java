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

    public static int[] convertToIntArray(ArrayList<Integer> list){
    	int[] intArray = new int[list.size()];
        int count = 0;
        for(int i : list){
            intArray[count++] = i;
        }
        return intArray;
    }
	public static int[] singleNumber(int[] nums) {
		ArrayList<Integer> singleNumbers = new ArrayList<Integer>();
        mergeSort(nums, 0, nums.length - 1);
       	for(int i = 0; i < nums.length - 1; i++){
       		if(nums[i] == nums[i + 1]){
       			i++;
       		}
       		else{
       			singleNumbers.add(nums[i]);
       		}
       	}
       	if(nums[nums.length - 1] != nums[nums.length - 2])
       		singleNumbers.add(nums[nums.length-1]);
        //return singleNumbers.stream().mapToInt(i -> i).toArray(); //this line will only work in java 8
        return convertToIntArray(singleNumbers); //this is the java7 solution, not as clean as java 8
    }

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 2, 5};
		int[] result = singleNumber(arr);
		System.out.println(result[0] + " " + result[1]); //{3, 5}

		int arr2[] = {1, 2, 1, 0, 2, 8};
		result = singleNumber(arr2);
		System.out.println(result[0] + " " + result[1]); //{0, 8}

		int arr3[] = {0, 5, 8, 2, 3, 0, 8};
		result = singleNumber(arr3);
		System.out.println(result[0] + " " + result[1] + " " + result[2]); //{2, 3, 5}

	}
}