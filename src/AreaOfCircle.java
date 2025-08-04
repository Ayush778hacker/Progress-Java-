import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radi = sc.nextInt();
        double cir = 2*(22/7)*radi;
        double ar = Math.pow(radi,2)*(22/7);
        System.out.println(cir);
        System.out.println(ar);
    }
}
