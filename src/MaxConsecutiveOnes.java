import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter " + (i+1) + " Value: ");
            arr[i]=sc.nextInt();
        }
        int count =0;
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count = 0;
            }
        }
        System.out.print(max);
    }
}
