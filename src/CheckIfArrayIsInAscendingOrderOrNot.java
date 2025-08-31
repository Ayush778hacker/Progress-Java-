import java.util.Scanner;

public class CheckIfArrayIsInAscendingOrderOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean sorted = true;
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
            if(sorted==true) {
                System.out.println("Array is in ascending order");
            }
            else{
                System.out.println("Array is not in Ascending order");
            }
    }
}
