import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String [] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt();
        System.out.print("Enter column: ");
        int m = sc.nextInt();
        int matrix [][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int temp [][] = new int [m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[j][i]= matrix[i][j];
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //for printing
        System.out.println("Transpose Matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
