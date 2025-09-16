import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][] =new int[n][n];
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                if(i==j){
                   leftSum += arr[i][j];
                }
                if(i+j==arr.length-1){
                    rightSum += arr[i][j];
                }
            }
        }
        System.out.println("Left Sum = " + leftSum);
        System.out.println("Right Sum = " + rightSum);
    }
}
