import java.util.Scanner;

public class ConsonantOrVowelInString {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String; ");
        String s = sc.nextLine();
        int vowel =0;
        int consonant = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u','A','E','I','O','U' : {
                    vowel++;
                }
                    break;
                default : {
                    consonant++;
                }
            }
        }
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + consonant);
    }
}
