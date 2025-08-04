import java.util.Scanner;

public class SperateEcahNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int s = sc.nextInt();

        while(s>0){
            int dig = s%10;
            System.out.println(dig);
            s=s/10;
        }
    }
}
