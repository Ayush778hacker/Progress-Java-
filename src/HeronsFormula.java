import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int a = sc.nextInt();
        System.out.println("Enter side 2: ");
        int b= sc.nextInt();
        System.out.println("Enter Side 3:");
        int c = sc.nextInt();

        double s = (a+b+c)/2;
        System.out.println("Semi Perimeter = " + s );
        double aws=s*(s-a)*(s-b)*(s-c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area without sqrt = " + area);
        System.out.println("Area = " + aws);
    }
}
