import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountOccurencesOfAnagrms {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String txt = sc.nextLine();
        System.out.print("Enter word: ");
        String pat = sc.nextLine();

        int count = countAnagrams(txt,pat);
        System.out.println("Total anagrams found: " + count);

        sc.close();
    }
    static int countAnagrams(String txt, String pat){
        int n = txt.length();
        int k = pat.length();
        if(n<k) return 0;

        int[] freqPat = new int[26];
        int[] freqTxt = new int[26];

        for(char c : pat.toCharArray()){
            freqPat[c - 'a']++;
        }
        int count = 0;

        for(int i=0;i<n;i++){
            freqTxt[txt.charAt(i) - 'a']++;


            if(i >= k){
                freqTxt[txt.charAt(i-k)- 'a']--;
            }
            if(i>=k-1 && Arrays.equals(freqPat,freqTxt)){
                count++;
            }
        }
        return count;
    }
}
