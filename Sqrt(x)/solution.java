class Solution {

    public static int mySqrt(int x) {
    	for(long i = 0; i <= x; i++){
    		if(i * i > x)
    			return (int)i - 1;
    		else if(x - (i * i) <= 0){
    			return (int)i;
    		}
    	}
    	return -1;
    }

	public static void main(String[] args) {
		System.out.println(mySqrt(0)); //0
		System.out.println(mySqrt(1)); //1
		System.out.println(mySqrt(2)); //1
		System.out.println(mySqrt(3)); //1
		System.out.println(mySqrt(4)); //2
		System.out.println(mySqrt(5)); //2
		System.out.println(mySqrt(6)); //2
		System.out.println(mySqrt(8)); //2
		System.out.println(mySqrt(9)); //3
		System.out.println(mySqrt(16)); //4
		System.out.println(mySqrt(81)); //9
		System.out.println(mySqrt(2147483647)); //46340
	}
}