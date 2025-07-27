import java.util.Scanner;

public class loops {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        /*23
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Hello World");
        }
*/
        /*24
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        for(int i =0; i<=n; i++){
            System.out.println(i);
        }
*/
        /*25
        System.out.println("Enter Number for reversing loop: ");
        int n = sc.nextInt();
        for(int i =n;i>=0;i--){
            System.out.println(i);
        }
*/

        /*26
        System.out.println("Enter Number For You Want Table: ");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
*/
         /*27
        System.out.print("Enter Number for sum: ");
        int c = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=c;i++){
            sum=sum+i;
        }
        System.out.print("Sum = " + sum);
*/
        /*28
        System.out.print("Enter Number For Factorial: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of " + a + " is : " + fact);
*/
        /*29
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
        */
        /*30
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }*/
        /*31
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int facto =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                facto=facto+i;
            }
        }
        System.out.print(facto);
    */
        /*32
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.print("Not Prime");
        }
         if(n==2){
            System.out.print("Prime");

        }
         if(n%2==0){
            System.out.println("Not prime");

        }

        else{
            for(int i=3;i<=n;i=i+2){
                if(n%i==0){
                System.out.print("Not Prime");
                break;
            }else{
                    System.out.print("Prime");
                    break;
                }
        }*/
        /*33
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int m =1;
        for(int i=0;i<b;i++){
           m = (m*a);
        }
        System.out.print(m);
        */
        /*34
        System.out.print("Enter Number: ");
        int s = sc.nextInt();

        while(s>0){
            int dig = s%10;
            System.out.println(dig);
            s=s/10;
        }
*/
        /*35
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        int sum = 0;

        while(a>0){
            int dig =a%10 ;
            sum = sum+dig;
            a=a/10;
        }
        System.out.print("Sum = " + sum);
  */
        /*36
        System.out.print("Enter Number: ");
        int v = sc.nextInt();

        while(v>0){
            int digs = v%10;
            System.out.print(digs);
            v=v/10;
        }
        */
        /*37*/
        System.out.print("ENter Number: ");
        int a = sc.nextInt();
        int copy = a;
        int rev = 0;
        while(a>0){
            int digs = a%10;
            rev = digs;
            a= a/10;
        }
        if(copy==rev){
            System.out.println("Palindromic");
        }
    }

}
