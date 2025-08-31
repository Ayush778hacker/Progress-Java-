import java.util.Scanner;

public class SumUpToN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for sum: ");
        int c = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=c;i++){
            sum=sum+i;
        }
        System.out.print("Sum = " + sum);
    }
}
