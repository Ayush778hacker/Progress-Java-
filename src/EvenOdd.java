import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        double n = sc.nextDouble();
        if(n%2==0) System.out.println("No is Even: "+ n);
        else{System.out.println("No is Odd: "+ n);
        }
    }
}
