class Solution {
	static String reverse(String str) {
		String reversed = "";
		String word = "";
		for(int i = str.length() - 1; i > -1; i--){
			if(str.charAt(i) == ' '){
				reversed = reversed + " " + word;
				word = "";
			}
			else
				word = str.charAt(i) + word;
		}
		return reversed + " " + word;
	}
	
	public static void main(String[] args) {
		String str = "luke I am your father";
		String reversed = reverse(str);
		System.out.println(reversed);
	}
}