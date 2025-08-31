import java.util.Scanner;

public class SwappingValues {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        /*In this code both parts have same variables so if you get error while compiling code so simply comment out any one part.*/
        /*Part-1*/
        System.out.println("Enter Your First Number: ");
        int fn = sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int sn = sc.nextInt();
        int temp =fn;
        fn = sn;
        sn = temp;

        System.out.println(fn);
        System.out.println(sn);
        System.out.println(temp);

        /*part-2*/
        System.out.println("Enter First Number: ");
        int fnn = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int snn = sc.nextInt();

        fnn = fnn + snn;
        snn = fnn - snn;
        fnn= fnn - snn ;

        System.out.println("fnn = "+ fnn);
        System.out.println("snn = "+ snn);
    }
}
