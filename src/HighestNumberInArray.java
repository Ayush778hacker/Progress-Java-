import java.util.Scanner;

public class HighestNumberInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0 , index = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            index =i;
            if(arr[i]>max){
                max = arr[i];

            }
        }
        System.out.println("The Greatest Value is " + max + "at index " + index);


    }
}
