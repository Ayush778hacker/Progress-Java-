import java.util.Scanner;

public class SphereSurfaceArea {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radii = sc.nextInt();
        double sa= 4*(22/7)*Math.pow(radii,2);
        System.out.println(sa);
    }
}
