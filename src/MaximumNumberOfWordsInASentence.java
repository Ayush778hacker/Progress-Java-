import java.util.Scanner;

public class MaximumNumberOfWordsInASentence {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many sentemces you want: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentences = new String[n];
        for(int i =0;i<n;i++){
            sentences[i]=sc.nextLine();
        }
       int maxwords = 0;
        for(String sentence : sentences){
            String [] words = sentence.split(" ");

            int count = words.length;
            if(count>maxwords){
                maxwords = count ;
            }
        }
        System.out.print("Maximum number of words in a sentence is : " + maxwords);
    }
}
