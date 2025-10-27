import java.util.Scanner;

public class MathProblemPowXN {
    public double mypower(double x,long n){
        if(n==0) return 1;
        if(n<0) return 1/solve(x,-(long)n);
        return solve(x,n);
    }
    double solve(double x, long n){
        if(n==0) return 1;
        double ans = solve(x,n/2);
        if(n%2==0) return ans*ans;
        return ans*ans*x;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = sc.nextDouble();
        System.out.print("Enter power: ");
        long n = sc.nextLong();
        MathProblemPowXN obj = new MathProblemPowXN();
        double result = obj.mypower(x,n);
        System.out.println("Answer : " + result);
    }
}
