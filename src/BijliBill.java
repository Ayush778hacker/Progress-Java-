import java.util.Scanner;

public class BijliBill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units: ");
        double units = sc.nextInt();

        if(units>=0 && units<=100){
            System.out.println("Your payable amount: " + (units*4.2));
        }
        else if(units>=101 && units<=200){
            System.out.println("Your payable amoune: " + (100*4.2)+(units-100)*6);
        }
        else if(units>=201 && units <=400){
            System.out.println("Your payable amoune: " + (100*4.2)+(100*6)+(units-200)*8);
        }
        else if(units>400){
            System.out.println("Your Payable Amount: " +(100*4.2)+(100*6)+(100*8)+(units-300)*13);}
    }
}
