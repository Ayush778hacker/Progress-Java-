import java.util.Scanner;

public class UserNameAge {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + " ,you are " + age + " years old.");
    }
}
