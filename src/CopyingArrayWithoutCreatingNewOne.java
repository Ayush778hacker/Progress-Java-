import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrayWithoutCreatingNewOne {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int i = 0, j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
