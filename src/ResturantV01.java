import java.util.Scanner;

public class ResturantV01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welcome To Bhoohk Mitao Resturant");
        System.out.println("Press 1 For Indian");
        System.out.println("Press 2 For Russian");
        System.out.println("Press 3 For Italian");
        System.out.println("Press 4 For Chinese");

        System.out.println(" So What Dou you want to eat?" );
        int n = sc.nextInt();
        int bill=0;

                int i=0;
        switch(n)  {
            case 1 : {
                do{
                    System.out.println("Press 1 for Chole Bhature: ");
                    System.out.println("Press 2 for Dal Chawal: ");
                    System.out.println("Press 3 for Idli : ");
                    System.out.println("Press 4 for Dosa: ");
                    System.out.println("Press 5 for Exit this menu");
                    int p = sc.nextInt();
                    switch(p) {
                        case 1 : {
                            System.out.println("Thank You For Your Order of Chole Bhature");
                            bill = bill+150;
                            break;
                        }
                        case 2 : {
                            System.out.println("Thank Your For your order of Dal Chawal ");
                            bill = bill+120;
                            break;
                        }
                        case 3 : {
                        System.out.println("Thank You For Your Order Of Idli");
                        bill = bill +70;
                        break;
                        }
                    case 4 : {
                        System.out.println("Thank You For your order of Dosa ");
                        bill = bill+80;
                        break;
                    }
                        case 5 : {
                            System.out.println("You are exiting thank you for visit");
                          i=(i*0)+5;
                            break;
                        }
                        }
                }
                while(i!=5);
                break;
            }
            case 2 : {

                do{
                    System.out.println("Press 1 For Borscht");
                    System.out.println("Press 2 For Pelmeni");
                    System.out.println("Press 3 For Blini ");
                    System.out.println("Press 4 For Beef Stroganof");
                    System.out.println("Press 5 for Exit this menu");
                    int r = sc.nextInt();
                    switch(r){
                        case 1 : {
                            System.out.println("Thank You for your order of Borscht");
                            bill = bill + 150;
                            break;
                        }
                        case 2 : {
                            System.out.println("Thank you for your order of Pelmeni");
                            bill = bill +170;
                            break;
                        }
                        case 3 : {
                            System.out.println("Thank You For Your Order Of Blini");
                            bill = bill +1980;
                            break;
                        }
                        case 4 : {
                            System.out.println("Thank You For Your Order Of Strognaof");
                            bill = bill +210;
                            break;
                        }
                        case 5 : {
                            System.out.println("Thank Your For Visiting");
                          i=(i*0)+5;
                            break;
                        }
                    }
                }
                while(i!=5);
                break;
            }
            case 3 : {

            }
        }
        System.out.println("Your Total Payable Amount is : " + bill);
    }
}
