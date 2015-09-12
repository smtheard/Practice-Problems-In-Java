import java.util.*;
class Solution {
	public static ArrayList<Integer> primeFactorization(int num){
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for(int i = 2; i <= num; i++){
			while(num % i == 0){
				if(!primeFactors.contains(i))
					primeFactors.add(i);
				num = num/i;
			}
		}
		return primeFactors;
	}
	public static boolean isUgly(int num) {
		ArrayList<Integer> primeFactors = primeFactorization(num);
		int conditions = 0;
		if(primeFactors.contains(2))
			conditions++;
		if(primeFactors.contains(3))
			conditions++;
		if(primeFactors.contains(5))
			conditions++;
        return primeFactors.size() == conditions;
    }

	public static void main(String[] args) {
		System.out.println(isUgly(1)); //T
		System.out.println(isUgly(6)); //T
		System.out.println(isUgly(8)); //T
		System.out.println(isUgly(14)); //F
	}
}