import java.util.Scanner;

public class BinaryToDecimalNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Binary Number: ");
        int n= sc.nextInt();
        int deci = 0;
        int count=0;
        while(n>0){
            int rem = n%10;
            int p = (int) Math.pow(2,count);
            deci = deci + ( rem * p);
            count++;
            n=n/10;
        }
        System.out.println(deci);
    }
}
