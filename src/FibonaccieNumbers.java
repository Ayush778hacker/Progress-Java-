public class FibonaccieNumbers {
    static void fun(int n ,int f ,int s){
        if (n==0) return;
        int third = f+s;
        System.out.println(third + " ");
        fun(n-1,s,third);


    }
    public static void main(String[]args){
        System.out.println(0);
        System.out.println(1);
        fun(10,0,1);
    }
}
