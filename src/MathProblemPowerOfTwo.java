import java.util.Scanner;

public class MathProblemPowerOfTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("False");
        }
        else if((n & (n-1))==0){
            System.out.println("True");
        }else{
            System.out.print("False");
        }
    }
}
