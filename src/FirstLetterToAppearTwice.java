import java.util.Scanner;
import java.util.HashSet;

public class FirstLetterToAppearTwice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bunch of letters: ");
        String letters = sc.nextLine();
        char ans = ' ';
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<letters.length();i++){
            char ch = letters.charAt(i);
            if(set.contains(ch)){
                ans=ch;
            }else{
                set.add(ch);
            }
        }
        System.out.print("This is the letter to be appear twice: " + ans);
    }
}
