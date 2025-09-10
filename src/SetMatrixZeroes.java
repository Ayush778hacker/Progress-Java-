import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[]args){
        int [][] matrix = {{1,2,3},{2,4,0},{6,5,9}};
        int n = matrix.length;
        int m = matrix[0].length;

        boolean [] row = new boolean[n];
        boolean [] column = new boolean [m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || column[j]){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
