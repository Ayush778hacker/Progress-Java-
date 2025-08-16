import java.util.Arrays;
import java.util.Scanner;

public class TakingSizeAndValuesAndCalculateSumAndAverage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        int sum =0;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("ENter Value");
            arr[i] = sc.nextInt();
            sum= sum + arr[i];
            count++;
        }
        int average = sum/count;
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(average);
    }
}
