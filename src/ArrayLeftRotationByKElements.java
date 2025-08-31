import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotationByKElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("How many times you want to left rotate elemnts: ");
        int K = sc.nextInt();
        K=K%arr.length;
        if(K==0){

            System.out.println(Arrays.toString(arr));
        }else {
            for (int i = 0; i < K; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;

            }

       System.out.println(Arrays.toString(arr));
        }
    }
}
