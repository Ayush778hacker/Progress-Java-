import java.util.Scanner;

public class PerimerterArea {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth = sc.nextInt();

        int parameter = 2*(length+breadth);
        int area = length*breadth;

        System.out.println("Parametr = " + parameter);
        System.out.println("Area = "+ area);
    }
}
