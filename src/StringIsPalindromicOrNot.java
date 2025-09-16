import java.util.Scanner;

public class StringIsPalindromicOrNot {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        String r = "";

        for(int i=s.length()-1;i>=0;i--){
            r = r + s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("Palindromic");
        }
        else{
            System.out.println("Not Palindromic");
        }

    }
}
