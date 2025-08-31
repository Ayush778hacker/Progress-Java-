import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();
        if(amount>0 && amount<=1000){
            System.out.println("Payable Amount: " + amount);
        }
        else if(amount>1000 && amount<=4000){
            System.out.println("Payable Amount: " + (amount-(amount*2)/100));
        }
        else if(amount>4000 && amount<=7000){
            System.out.println("Payable Amount: " + (amount-(amount*3)/100));
        }
        else if (amount>7000 && amount<=10000){
            System.out.println("Payable Amount: " + (amount-(amount*5)/100));
        }
        else if(amount>1000){
            System.out.println("Payable Amount: " + (amount-(amount*8)/100));
        }
        else{
            System.out.println("Invalid value");
        }
    }
}
