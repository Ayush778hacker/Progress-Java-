import java.util.Scanner;

public class FibonaccieNumbers {
    static void fun(int n ,int f ,int s){
        if (n==0) return;
        int third = f+s;
        System.out.println(third + " ");
        fun(n-1,s,third);


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n term: ");
        int n = sc.nextInt();

        if(n<1) return ;
        System.out.println(0);

        if(n==1) return;
        System.out.println(1);

        fun(n-2,0,1);
    }
}
