import java.util.Scanner;

public class RightTriangleAlphabetPattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        for(char ah=65;ah<=ch;ah++){
            for(char bh =65;bh<=ah;bh++){
                System.out.print(bh + " ");
            }
        }
        System.out.println();

    }
}
