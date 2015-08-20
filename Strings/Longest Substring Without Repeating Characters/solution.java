class Solution {
	public static int lengthOfLongestSubstring(String s) {
        String longestSubstring = "";
        String currentSubstring = "";
        for(int i = 0; i < s.length(); i++) {
        	if(currentSubstring.length() > longestSubstring.length())
        		longestSubstring = currentSubstring;
        	if(!currentSubstring.contains(Character.toString(s.charAt(i)))){
        		currentSubstring += s.charAt(i);
        	}
        	else
        		currentSubstring = Character.toString(s.charAt(i));
        }
        if(currentSubstring.length() > longestSubstring.length())
        		longestSubstring = currentSubstring;

        return longestSubstring.length();
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf")); //3
		System.out.println(lengthOfLongestSubstring("aaaaaaaaa")); //1
		System.out.println(lengthOfLongestSubstring("abcabcabc")); //3
		System.out.println(lengthOfLongestSubstring("abcabcabcc")); //3
		System.out.println(lengthOfLongestSubstring("abcabcabcd")); //4
		System.out.println(lengthOfLongestSubstring("abcabdecabc")); //5 abdec
	}
}