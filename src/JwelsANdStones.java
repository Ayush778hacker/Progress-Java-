    import java.util.HashSet;
    import java.util.Scanner;
    public class JwelsANdStones {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Jewels:  ");
            String jewels = sc.nextLine();
            System.out.print("Enter stones: ");
            String stones = sc.nextLine();
            int count = 0;

            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<jewels.length();i++){
                char ch = jewels.charAt(i);
                set.add(ch);
            }
            for(int i=0;i<stones.length();i++){
                char bh = stones.charAt(i);

                if(set.contains(bh)){
        count++;
            }
            }
            System.out.println(count);
        }
            }