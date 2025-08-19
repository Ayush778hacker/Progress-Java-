import java.util.Scanner;

public class HighestNumberInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0 , index = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + " element" );
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index =i;

            }
        }
        System.out.println("The Greatest Value is " + max + "at index " + index);


    }
}
