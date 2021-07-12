package Array2D;

import java.util.ArrayList;

public class Medium {
    public static void main(String[] args) {
//        spiralTraversal();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
//        System.out.println(searchMatrix(matrix,12));

    }

    public static void spiralTraversal(){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

        int top = 0;
        int right = matrix[0].length-1;
        int left = 0;
        int bottom = matrix.length-1;
        int direction = 0;

        while(top<=bottom && left<=right){
            if(direction==0){
                System.out.println("Changing Direction");
                for(int i = left;i<=right;i++){
                    System.out.println(matrix[top][i]);
                }
                top++;
            }

            if(direction==1){
                System.out.println("Changing Direction");
                for(int i = top;i<=bottom;i++){
                    System.out.println(matrix[i][right]);
                }
                right--;
            }

            if(direction==2){
                System.out.println("Changing Direction");
                for(int i = right;i>=left;i--){
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }

            if(direction==3){
                System.out.println("Changing Direction");
                for(int i = bottom;i>=top;i--){
                    System.out.println(matrix[i][left]);
                }
                left++;
            }

            direction++;

            if(direction==4){
                direction=0;
            }

        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0;i<matrix.length;i++){
            int firstVal = matrix[i][0];
            int lastVal = matrix[i][matrix[0].length-1];


            if(target<=lastVal && target>=firstVal){
                for(int a = 0;a<matrix[0].length;a++){
                    System.out.println(a);
                    if(target==matrix[i][a]){
                        return true;
                    }
                }
                return false;
            }

        }
        return false;
    }
}
