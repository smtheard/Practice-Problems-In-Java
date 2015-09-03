class Solution {
    public static int lengthOfLastWord(String s) {
    	int length = 0;
    	for(int i = s.length() - 1; i > -1; i--){
            if(s.charAt(i) == ' ' && length == 0)
                continue;
            else if(s.charAt(i) == ' ')
                return length;
            length++;
    	}
        return length;
    }
	
	public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a ")); //1
        System.out.println(lengthOfLastWord("Hello World be")); //2
        System.out.println(lengthOfLastWord("Hello to the World of Word")); //4
		System.out.println(lengthOfLastWord("Hello")); //5
		System.out.println(lengthOfLastWord("Hello World")); //5
	}
}