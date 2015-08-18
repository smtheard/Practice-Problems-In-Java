class Solution {
	static char[] reverse(char[] str) {
		for(int i = 0; i < str.length/2; i++){
			char temp = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - 1 - i] = temp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		char[] reversed = reverse(str);
		System.out.println(reversed);
	}
}