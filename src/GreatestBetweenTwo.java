import java.util.Scanner;

public class GreatestBetweenTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No: ");
        int a = sc.nextInt();
        System.out.println("Enter Second No: ");
        int b = sc.nextInt();
        if(a>b) System.out.println("A is greater Than B");
        else{System.out.println("B is Greater Than A");
        }

    }
}
