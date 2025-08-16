import java.util.Scanner;

public class SecondGreatestinArra {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int greatest = Math.max(arr[0],arr[1]);
        int secondGreatest = Math.min(arr[0],arr[1]);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + " element" );
            arr[i] = sc.nextInt();
            if(arr[i]>greatest){
                secondGreatest = greatest;
                greatest = arr[i];
            }
            else if(arr[i]>secondGreatest){
                secondGreatest = arr[i];
            }

        }
        System.out.println("The Greates Element is " + greatest);
        System.out.println("The Second Greates Element is " + secondGreatest);
    }
}
