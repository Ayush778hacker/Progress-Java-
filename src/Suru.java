import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Suru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ayush", 10000);
        map.put("Harsh", 6000);
        map.put("Rishabh", 5000);
        map.put("Tushar", 4000);

        System.out.println("For Key");
        System.out.println();
        for(String naam : map.keySet()){
            System.out.println(naam);
        }
        System.out.println("For Values");
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }

        System.out.println("For Both");
        System.out.println();
    for(Map.Entry<String,Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    }
}












