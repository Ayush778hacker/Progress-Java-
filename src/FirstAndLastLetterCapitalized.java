import java.util.Scanner;

public class FirstAndLastLetterCapitalized {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";
        for(String word : words){
            if(word.length()==1){
                result += word.toUpperCase();
            }
            else{
                String first = word.substring(0,1).toUpperCase();
                String middle = word.substring(1,word.length()-1);
                String last = word.substring(word.length()-1).toUpperCase();
                result += first + middle + last;
            }
        result +=" ";
        }
        System.out.print(result.trim());
    }
}
