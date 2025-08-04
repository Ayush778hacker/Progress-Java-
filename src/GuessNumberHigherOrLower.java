import java.util.Scanner;

public class GuessNumberHigherOrLower {
    public  static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int target=sc.nextInt();
        int [] arr = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21,
                23, 25, 27, 29, 31, 33, 35, 37, 39, 41};
        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(arr[mid] == target){
                System.out.println("Number is equal");
                break;
            }
            else if(arr[mid]<target){
                System.out.println("Number is Lower than target");
                break;

            }else{
                System.out.println("Number is Greater than target");
                break;
            }
        }
        if(f>l){
            System.out.println("Not found");
        }
    }
}
