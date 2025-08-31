import java.util.Scanner;

public class ValidVoter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age<18) System.out.println("You are not  vaild to vote till this age");
        else if (age<=0) {
            System.out.println("Invailid age");
        }
        else{System.out.println("You are no eligible to vote You can proceed: ");
        }
    }
}
