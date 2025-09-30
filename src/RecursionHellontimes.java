public class RecursionHellontimes {
    static void fun(int a){
        if(a==0) return;
        System.out.println("Hello");
        fun(a-1);
    }

    public static void main(String[]args){
    fun(5);
    }
}
