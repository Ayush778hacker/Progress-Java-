import java.util.Scanner;
public class MathProblemsCount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Counting numbers
  /*      int n =547;
        System.out.println((int)Math.log10(n)+1);
*/
        //Factors
        int a = sc.nextInt();
        for(int i=1;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                System.out.print(i + " ");
            }
        }
        for(int i=(int)Math.sqrt(a);i>1;i--){
            if(i!=a/i && a%i==0){
                System.out.print(a/i + " ");
            }
        }
    }
}
