import javax.xml.transform.Source;
import java.util.Scanner;

public class LinearSearchInArrayIfNotFoundElseMinus1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,30,40,50};
        int index =-1;
        System.out.print("Enter number you want to find: ");
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
               index = i;
               break;
            }
        }
        if(index==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found At Index " + (index));
        }
    }
}
