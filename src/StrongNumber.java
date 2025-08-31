import java.util.Scanner;

public class StrongNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int sum = 0;
        int copy = a;
        while (a > 0) {
            int digs = a % 10;
            int fact = 1;
            for (int i = 1; i <= digs; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            a = a / 10;
        }
        if(sum==copy){
            System.out.println("Number is Strong");
        }else{
            System.out.println("Number is not strong");
        }
        System.out.println("Sum is = " +  sum);
    }
}
