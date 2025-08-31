import java.util.Scanner;

public class GreatestBetweenThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No: ");
        double fn = sc.nextDouble();
        System.out.println("Enter Second No: ");
        double sn = sc.nextInt();
        System.out.println("Enter Third No: ");
        double tn = sc.nextInt();
        if(fn>sn && fn>tn) System.out.println("A is Greater than B and C");
        else if (sn>fn && sn>tn) {
            System.out.println("B is greater than A and c");
        }
        else if(tn>sn && tn>fn){
            System.out.println("c is greater than a and b");}
        else{System.out.println(" Error Value");}
    }
}
