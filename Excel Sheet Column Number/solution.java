import java.util.*;

class Solution {
	public static int titleToNumber(String s) {
		int num = 0;
		for(int i = 0; i < s.length(); i++){
			num += (s.charAt(i) - 64) * Math.pow(26, s.length() - 1 - i);
		}
		return num;
    }

	public static void main(String[] args) {
		String input = "A";
		System.out.println(titleToNumber(input)); //1

		input = "B";
		System.out.println(titleToNumber(input)); //2

		input = "Z";
		System.out.println(titleToNumber(input)); //26

		input = "AA";
		System.out.println(titleToNumber(input)); //27

		input = "AB";
		System.out.println(titleToNumber(input)); //28

		input = "BA";
		System.out.println(titleToNumber(input)); //53

		input = "BZ";
		System.out.println(titleToNumber(input)); //78

		input = "AAA";
		System.out.println(titleToNumber(input)); //703
	}
}