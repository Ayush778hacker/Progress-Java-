public class RecursionFactorial {
    static long factorial(int a){
        if(a<0) throw new IllegalArgumentException("n must be >0");
        if(a==1)return 1;
        return a*factorial(a-1);
    }
    public static void main(String[]args){
        System.out.println(factorial(5));
    }
}
