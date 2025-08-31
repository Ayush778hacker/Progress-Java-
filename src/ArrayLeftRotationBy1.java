import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotationBy1 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + " element");
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
