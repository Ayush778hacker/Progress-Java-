import java.util.Scanner;
public class GcdOrHCFUsingrecursion {
    /*static int gcd(int a , int b , int c){
        if(c==1) return 1;
    if(a%c==0 && b%c==0){
        return c;
    }
    return gcd(a,b,c-1);
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a = sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b = sc.nextInt();
    sc.close();
    int c = Math.min(a,b);
    System.out.println(gcd(a,b,Math.min(a,b)));

    }
    */
    /*OR Euclidean Algo*/
    static int gcd(int a , int b){
        if(a==b) return a;
        if(a>=b) return gcd(a-b,b);
        return gcd(a,b-a);
    }
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();

        System.out.println(gcd(a,b));
    }
}
