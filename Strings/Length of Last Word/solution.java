class Solution {
    public static int lengthOfLastWord(String s) {
    	int length = 0;
    	for(int i = 0; i < s.length(); i++){
    		length++;
    		if(s.charAt(i) == ' ')
    			length = 0;
    	}
        return length;
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello")); //5
		System.out.println(lengthOfLastWord("Hello World")); //5
		System.out.println(lengthOfLastWord("Hello World be")); //2
		System.out.println(lengthOfLastWord("Hello to the World of Word")); //4
	}
}