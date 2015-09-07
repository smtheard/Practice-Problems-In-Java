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
        return primes.contains(2) && 
        	   primes.contains(3) &&
        	   primes.contains(5) &&
        	   primes.size() == 3;
    }

	public static void main(String[] args) {
		System.out.println(isUgly(1)); //T
	}
}