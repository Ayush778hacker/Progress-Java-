import java.util.HashSet;
import java.util.Scanner;

public class HashingUniqueElements {
    public static void main(String[]args){
        // In this file we also try with add,contains and remove methods..
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,1,4,2,5,5,3};

    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(set.contains(arr[i])){
            set.remove(arr[i]);
        }
        else{
            set.add(arr[i]);
        }
    }
        System.out.println(set);
    }
}
