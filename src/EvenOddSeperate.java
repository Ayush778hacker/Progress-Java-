import java.util.Scanner;

public class EvenOddSeperate {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number for seperating sum of even and odd number: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even =even+i;
            }
            else {
                odd =odd+i;
            }
        }
        System.out.println("Even = " + even);
        System.out.print("Odd = " + odd);
    }
}
