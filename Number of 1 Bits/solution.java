class Solution {

    public static int hammingWeight(int n) {
    	return (n - 1) % 9 + 1;
    }

	public static void main(String[] args) {
		System.out.println(hammingWeight(0)); //0
		System.out.println(hammingWeight(1)); //1
		System.out.println(hammingWeight(1000)); //1
		System.out.println(hammingWeight(0001)); //1
		System.out.println(hammingWeight(0010000000));//1
		System.out.println(hammingWeight(1001)); //2
		System.out.println(hammingWeight(100101)); //3
		System.out.println(hammingWeight(00000000000000000000000000001011)); //3
		System.out.println(hammingWeight(1111)); //4
		System.out.println(hammingWeight(1111111111));//10
	}
}