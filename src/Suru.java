
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class Suru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*1
        int a =15;
        int b= 6;
        System.out.println(a+b);
  */
  /*2
  int a =18;
  int b= 8;
  System.out.println("The sum of "+ a + " & " + b + " is " + (a+b));
  */
 /*3
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b =sc.nextInt();
        System.out.println("The Sum of "+ a +" & " + b + " is " + (a+b));
        */
/*4
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + " ,you are " + age + " years old.");
*/
/*5 (Increment Decrement Operator)
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
         System.out.println(a++ + b-- + --a + b++);
*/
/*6 (Part-1)
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
*/
        /*Part-2)

        System.out.println("Enter First Number: ");
        int fnn = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int snn = sc.nextInt();

        fnn = fnn + snn;
        snn = fnn - snn;
        fnn= fnn - snn ;

        System.out.println("fnn = "+ fnn);
        System.out.println("snn = "+ snn);
*/
       /*7

       System.out.println("Enter Length: ");
       int length = sc.nextInt();
       System.out.println("Enter Breadth: ");
       int breadth = sc.nextInt();

       int parameter = 2*(length+breadth);
       int area = length*breadth;

       System.out.println("Parametr = " + parameter);
       System.out.println("Area = "+ area);
       */
       /*8

        System.out.println("Enter Principal Amount: ");
        double p = sc.nextInt();
        System.out.println("Enter rate  of interest: ");
        double r =sc.nextInt();
        System.out.println("Enter no of times: ");
        double n = sc.nextInt();
        System.out.println("Enter time in years: ");
        double t = sc.nextInt();

        double d = Math.pow((1+(r/100)*n),n*t);

        System.out.println("Ci before amount = " + (p*d));
        */
        /*9
        System.out.println("Enter side 1: ");
        int a = sc.nextInt();
        System.out.println("Enter side 2: ");
        int b= sc.nextInt();
        System.out.println("Enter Side 3:");
        int c = sc.nextInt();
        
        double s = (a+b+c)/2; 
        System.out.println("Semi Perimeter = " + s );
        double aws=s*(s-a)*(s-b)*(s-c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area without sqrt = " + area);
        System.out.println("Area = " + aws);
*/
        /*10
        System.out.println("Enter Radius: ");
        int radii = sc.nextInt();
         double sa= 4*(22/7)*Math.pow(radii,2);
        System.out.println(sa);
         */

         /*11
        System.out.println("Enter Radius: ");
        int radi = sc.nextInt();
        double cir = 2*(22/7)*radi;
        double ar = Math.pow(radi,2)*(22/7);
        System.out.println(cir);
        System.out.println(ar);
*/
        /*12
        System.out.println("Enter First No: ");
        int a = sc.nextInt();
        System.out.println("Enter Second No: ");
        int b = sc.nextInt();
        if(a>b) System.out.println("A is greater Than B");
        else{System.out.println("B is Greater Than A");
        }
        */
        /*13 And 14
        System.out.println("Enter our Gender in M Or F M-> Male & F-> Female (in capital letter only): ");
        char ch = sc.next().charAt(0);
        if(ch=='M'|| ch=='m') System.out.println("Good Morning Sir,Have a nice day..");
        else if(ch=='F'||ch=='f'){
            System.out.println("Good Morning Mam, Have a nice day..");
        }
        else{System.out.println("Value Error");
        }*/
        /*15*/
        /*
        System.out.println("Enter No: ");
        double n = sc.nextDouble();
        if(n%2==0) System.out.println("No is Even: "+ n);
        else{System.out.println("No is Odd: "+ n);
        }*/
        /*16*/
        /*
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age<18) System.out.println("You are not  vaild to vote till this age");
        else if (age<=0) {
            System.out.println("Invailid age");
        }
        else{System.out.println("You are no eligible to vote You can proceed: ");
        }
        */
        /*17
        System.out.println("Enter Day: ");
        int day = sc.nextInt();

        if(day==1) System.out.println("Monday");
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");}
        else if (day == 4) {
            System.out.println("Thursday");}
        else if(day==5){
            System.out.println("Friday");}
        else if(day==6){
            System.out.println("Saturday");}
        else if(day==7){
            System.out.println("Sunday");}
        else{System.out.println("Error value");
        }
        */
        /*18*/
        /*
        System.out.println("Enter First No: ");
        double fn = sc.nextDouble();
        System.out.println("Enter Second No: ");
        double sn = sc.nextInt();
        System.out.println("Enter Third No: ");
        double tn = sc.nextInt();
        if(fn>sn && fn>tn) System.out.println("A is Greater than B and C");
        else if (sn>fn && sn>tn) {
            System.out.println("B is greater than A and c");
        }
        else if(tn>sn && tn>fn){
            System.out.println("c is greater than a and b");}
        else{System.out.println(" Error Value");
        }*/
    for(int i=0;i<=10000000;i++){
        System.out.println(i);
    }
        }

    }














