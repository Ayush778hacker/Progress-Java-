import java.util.Scanner;

public class SumOfDigitsOfaNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        int sum = 0;

        while(a>0){
            int dig =a%10 ;
            sum = sum+dig;
            a=a/10;
        }
        System.out.print("Sum = " + sum);
    }
}
