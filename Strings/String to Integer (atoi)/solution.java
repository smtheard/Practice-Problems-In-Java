import java.lang.*;

class Solution {
	public static int power(int base, int pow) {
		if(pow == 0)
			return 1;
		return base * power(base, --pow);
	}

	public static int commaCount(String str){
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ',' )
				count++;
		}
		return count;
	}

    public static int myAtoi(String str) {
    	int result = 0;
    	int pow = str.length() - 1 - commaCount(str);
    	for(int i = 0; i < str.length(); i++){
    		if(str.charAt(i) == ',' ){
    			pow++;
    			continue;
    		}
    		else if(str.charAt(i) == '.'){
    			return result/power(10, pow);
    		}
    		result = result + (str.charAt(i) - 48) * power(10, (pow - i));
    	}
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(myAtoi("5175"));
		System.out.println(myAtoi("57,182"));
		System.out.println(myAtoi("5.00"));
	}
}