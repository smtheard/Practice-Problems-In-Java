class Solution {
	public static boolean isPerfectSquare(int n){
		return (Math.sqrt(n) * Math.sqrt(n) == n);
	}
	public static int numSquares(int n) {
		return 2;
    }

	public static void main(String[] args) {
		System.out.println(numSquares(12)); //3
		System.out.println(numSquares(13)); //2
	}
}