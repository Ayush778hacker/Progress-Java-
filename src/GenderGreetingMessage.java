import java.util.Scanner;

public class GenderGreetingMessage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter our Gender in M Or F M-> Male & F-> Female (in capital letter only): ");
        char ch = sc.next().charAt(0);
        if(ch=='M'|| ch=='m') System.out.println("Good Morning Sir,Have a nice day..");
        else if(ch=='F'||ch=='f'){
            System.out.println("Good Morning Mam, Have a nice day..");
        }
        else{System.out.println("Value Error");
        }
    }
}
