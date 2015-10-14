class Solution {
    public static void fizzBuzz() {
        for(int i = 1; i < 101; i++){
            if(i % 3 == 0 || i % 5 == 0){
                if(i % 3 == 0)
                    System.out.print("Fizz");
                if(i % 5 == 0)
                    System.out.print("Buzz");
                System.out.println("");
            }
            else
                System.out.println(i);
        }
    }

	public static void main(String[] args) {
        fizzBuzz();                     
    }
}