import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[]args){
        int arr[] = {10,20,30,40,50};
        int temp[] =  new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            for(int j=0;j<=i;j++){
                temp[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
