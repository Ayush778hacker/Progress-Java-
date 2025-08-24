import java.util.Scanner;

public class ConvertingDecimalToBinaryNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin =0;
        int place =1;
        while(n>0){
            int rem = n%2;
            bin = bin + (place*rem);
            place = place*10;
            n=n/2;
        }
        System.out.println(bin);

    }
}
