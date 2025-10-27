import java.util.Scanner;

public class MathProblemSqrtx {
    public static int sqrt(int x){
    if(x==0 || x==1){
        return x;
    }
    int first =0;
    int last =x/2;
    int ans =0;

    while(first<=last) {
        int mid = first + (last - first) / 2;
        long square = (long)mid*mid;
        if(square==x){
            return mid;
        }
        else if(square<x){
            ans=mid;
            first=mid+1;
        }
        else{
            last = mid-1;
        }
    }
    return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        int result = sqrt(x);
        System.out.println(result);
    }
}
