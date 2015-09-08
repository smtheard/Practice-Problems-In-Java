import java.util.*;
class Solution {
	public static ArrayList<Integer> primeFactors(int num){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		return primes;
	}
	public static boolean isUgly(int num) {
		ArrayList<Integer> primes = primeFactors(num);
		int conditions = 0;
		if(primes.contains(2))
			conditions++;
		else if(primes.contains(3))
			conditions++;
		else if(primes.contains(5))
			conditions++;
        return primes.size() == conditions;
    }

	public static void main(String[] args) {
		System.out.println(isUgly(1)); //T
		System.out.println(isUgly(6)); //T
		System.out.println(isUgly(8)); //T
		System.out.println(isUgly(14)); //F
	}
}