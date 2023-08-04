package ss3_array_and_method_in_java.bai_tap;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 0},
                {4, 5, 6, 9},
                {7, 2, 5, 5}
        };
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max+" La gia tri lon nhat");
    }
}
