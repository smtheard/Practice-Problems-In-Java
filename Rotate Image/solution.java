class Solution {
    public static void rotate(int[][] matrix) {
        int[][] matrix_cpy = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix.length; j++)
                matrix_cpy[i][j] = matrix[i][j];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                    matrix[i][j] = matrix_cpy[j][i];
            }
        }
    }

	public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, 
                          {3, 4, 5}, 
                          {6, 7, 8}};
        rotate(matrix);
        for(int i = 0; i < matrix.length; i++){     //{{6, 3, 0},
            for(int j = 0; j < matrix.length; j++)  // {7, 4, 1},
                System.out.print(matrix[i][j]);     // {8, 5, 2}};
            System.out.println("");
        }                        
    }
}