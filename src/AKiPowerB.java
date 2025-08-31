import java.util.Scanner;

public class AKiPowerB {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int m =1;
        for(int i=0;i<b;i++){
            m = (m*a);
        }
        System.out.print(m);
    }
}
