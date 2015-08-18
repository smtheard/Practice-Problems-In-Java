import java.util.*;

class Solution {
	public static int sumOfSquareDigits(int n){
		int sum = 0;
		while(n > 9) {
			sum = sum + (n % 10) * (n % 10);
			n = (n - (n % 10))/10;
		}
		return sum + (n * n);
	}
	public static boolean isHappy(int n) {
		int sum = 0;
		ArrayList<Integer> outputList = new ArrayList<Integer>();

		sum = sumOfSquareDigits(n);

		while(!outputList.contains(sum)){
			outputList.add(sum);
			sum = sumOfSquareDigits(sum);
			if(sum == 1)
				return true;
		}
        return false;
    }

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}