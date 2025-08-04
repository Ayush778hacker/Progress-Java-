import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number yyou want to reverse: ");
        int n = sc.nextInt();
        int rev = 0;
        int copy = n;
        while(n>0){
            int digs = n%10;
            rev =(rev*10)+digs;
            n=n/10;
        }
        if(copy == rev){
            System.out.print("Number is Pallindromic.");
        }else{
            System.out.print("Number is not Pallindromic.");
        }
    }
}
