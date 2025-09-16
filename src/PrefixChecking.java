import java.util.Scanner;

public class PrefixChecking {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String [] lists= new String[n];
        for(int i=0;i<n;i++){
            lists[i]=sc.nextLine();
        }

        System.out.print("Enter your prefix: ");
        String pref = sc.nextLine();
        int count =0;
        for(String word : lists){
            if(word.startsWith(pref)){
                count++;

            }
        }
        System.out.println("Total words that starts with " + pref + " = " + count);
    }
}
