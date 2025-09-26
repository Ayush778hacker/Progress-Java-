import java.util.Scanner;

public class BitManiulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      /*Swapping two numbers without using third variable      */
        System.out.println("Swapping Numbers Question");
        System.out.println();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        System.out.println("Value of a before swap: " + a);
        System.out.println("Value of b before swap: " + b);

        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a after swap: " + a);
        System.out.println("value of b after swap: " + b);
        System.out.println();

    /*Even Odd*/
         System.out.println("Even Odd Checking Question");
        System.out.println("Enter first number: ");
        int c = sc.nextInt();
        int d = c&1;
        if (d != 0){
            System.out.print("Number is odd : " + c);
        }
        else{
            System.out.println("Number is even : " + c);
        }
        System.out.println();

     /*Set bit is present or not*/
       System.out.println("Set bit is present or not");
        System.out.println();
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position: ");
        int i = sc.nextInt();
        int k = 1<<i;
        if((n&k) == 0){
            System.out.println("Set Bit is not present");
        }
        else{
            System.out.println("Set bit is present");
        }
        System.out.println();
        /*Flipping a specific bit*/
       System.out.println("Flipping a specific bit");
        System.out.println();

        System.out.print("Enter number: ");
        int e = sc.nextInt();
        System.out.print("Enter bit position you want to flip: ");
        int f = sc.nextInt();
        int g = 1<<f;
        System.out.println("After flipping : " + (e^g));
        System.out.println();

        /*Power of 2 checking*/
        System.out.println("Power of 2 checking");
        System.out.println();

        System.out.print("Enter number: ");
        int h = sc.nextInt();
        int j = h-1;
        if((h&j)==0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not power of 2");
        }
}
}
