import java.util.Arrays;
import java.util.Scanner;

public class Suru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum =0;
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
            sum= sum + arr[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}












