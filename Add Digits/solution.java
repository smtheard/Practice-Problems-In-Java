class Solution {
	public static int addDigits(int num) {
        while(num > 9){
        	num = num/10 + num - (num/10 * 10);
        }
        return num;
    }
	
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}
}