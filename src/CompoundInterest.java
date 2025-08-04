import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        double p = sc.nextInt();
        System.out.println("Enter rate  of interest: ");
        double r =sc.nextInt();
        System.out.println("Enter no of times: ");
        double n = sc.nextInt();
        System.out.println("Enter time in years: ");
        double t = sc.nextInt();

        double d = Math.pow((1+(r/100)*n),n*t);

        System.out.println("Ci before amount = " + (p*d));
    }
}
