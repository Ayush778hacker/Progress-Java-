import java.util.Scanner;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+ (i+1) +" Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter size of k: ");
        int k = sc.nextInt();
        int i=0, j=0;
        int sum =0;
        int maxSum = 0;
        while(j<arr.length){
            sum +=arr[j];
            if(j-i+1<k) j++;
            else{
                maxSum = Math.max(maxSum,sum);
                sum -=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxSum);
    }
}
