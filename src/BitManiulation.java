import java.util.Scanner;

public class BitManiulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a: ");
        int a = sc.nextInt();
        System.out.print("ENter b: ");
        int b= sc.nextInt();
        System.out.println("Value of a before swap: " + a);
        System.out.println("Value of b before swap: " + b);

        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a after swap: " + a);
        System.out.println("value of b after swap: " + b);
    }
}
