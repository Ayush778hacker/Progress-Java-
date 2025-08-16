import java.util.Scanner;

public class CheckIfArrayIsInAscendingOrderOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60};
        boolean sorted = true;
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
