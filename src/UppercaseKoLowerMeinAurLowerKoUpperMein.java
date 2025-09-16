import java.util.Scanner;

public class UppercaseKoLowerMeinAurLowerKoUpperMein {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String word = sc.nextLine();

        String result = "";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(ch>='a' && ch<='z'){
                result += (char)(ch -32);
            }
            else if(ch>='A' && ch<='Z'){
                result += (char)(ch+32);
            }
            else{
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
