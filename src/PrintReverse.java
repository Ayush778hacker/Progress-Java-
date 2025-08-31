import java.util.Scanner;

public class PrintReverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int v = sc.nextInt();

        while(v>0){
            int digs = v%10;
            System.out.print(digs);
            v=v/10;
        }
    }
}
