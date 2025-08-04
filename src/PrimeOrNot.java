import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.print("Not Prime");
        }
        if(n==2){
            System.out.print("Prime");

        }
        if(n%2==0){
            System.out.println("Not prime");

        }

        else{
            for(int i=3;i<=n;i=i+2){
                if(n%i!=0){
                    System.out.print(" Prime");
                    break;
                }else{
                    System.out.print("Not Prime");
                    break;
                }
            }
    }
}}
