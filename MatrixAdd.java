import java.util.*;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("THE ADDITION OF TWO MATRICES IS:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }


        
    }
    
}
