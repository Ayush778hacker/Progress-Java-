import java.util.Scanner;

public class loops {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        /*23*/
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Hello World");
        }
        /*Table*/
        System.out.println("Enter Number For You Want Table: ");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
