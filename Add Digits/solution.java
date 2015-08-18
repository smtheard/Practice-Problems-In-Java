class Solution {
	public static int addDigits(int num) {
        while(num > 9){
        	num = num/10 + num - (num/10 * 10);
        }
        return num;
    }
	
	public static int addDigitsFast(int num) {
		return (num - 1) % 9 + 1;
	}

	public static void main(String[] args) {
		System.out.println(addDigits(63829));
		System.out.println(addDigitsFast(63829));
	}
}