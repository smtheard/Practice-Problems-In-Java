import java.util.*;

class Solution {
	public static int titleToNumber(String s) {
        return s.length() * 26 - 26 + (s.charAt(s.length() - 1) - 64);
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
		input = "AAA";
		System.out.println(titleToNumber(input)); //53
	}
}