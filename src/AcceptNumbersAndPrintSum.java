import java.util.Scanner;

public class AcceptNumbersAndPrintSum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b =sc.nextInt();
        System.out.println("The Sum of "+ a +" & " + b + " is " + (a+b));
    }
}
