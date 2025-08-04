import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int copy = n;
        int count = 0;
        int sq=copy*copy;
        while(n>0){
            count++;
            n=n/10;
        }
        if(sq % Math.pow(10,count)== copy){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
}
