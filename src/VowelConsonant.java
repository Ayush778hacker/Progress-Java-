import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char ch =sc.nextLine().charAt(0);
        switch(ch){
            case 'a','A' : {
                System.out.println("Vowel");
                break;
            }
            case 'e','E' : {
                System.out.println("Vowel");
                break;
            }
            case 'i','I' : {
                System.out.println("Vowel");
                break;
            }
            case 'o','O' : {
                System.out.println("Vowel");
                break;
            }
            case 'u','U' : {
                System.out.println("Vowel");
                break;
            }
            default:{
                System.out.println("Consonant");
            }
        }
    }
}
