import java.util.Scanner;

public class FirstWordCapitalizedAndPrintOnNewLineEachWord {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sen = sc.nextLine();

        String [] words = sen.split(" ");
        for(String word : words){
            if(word.length()>0){
                String ans = word.substring(0,1).toUpperCase() + word.substring(1);
                System.out.println(ans + " ");
            }
        }
    }
}
