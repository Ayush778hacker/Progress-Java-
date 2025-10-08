import java.util.HashSet;
import java.util.Scanner;

public class PanagramUsingSet {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            set.add(ch);
        }
        if(set.size() == 26){
            System.out.println("Sentence is panagram");
        }else{
            System.out.println("Sentence is not panagram");
        }

    }
}
