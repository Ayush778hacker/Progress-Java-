import java.util.Scanner;

public class Binarysearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find: ");
        int target = sc.nextInt();
        int [] arr= {2,7,8,9,10,12,13,14,16,18,19};
        int f=0;
        int l=arr.length-1;
        while(f<=l){
        int mid= f+ (l-f)/2;
            if(arr[mid]==target){
                System.out.println("Found At Index: " + mid);
                break;
            }
            else if(arr[mid]>target){
                l=mid-1;
            }
            else {
                f=mid+1;
            }
        }
        if(f>l){
            System.out.println("Not Found");
        }
    }
}
