public class RecursionNse1NumberPrint {
    static void fun(int a){
        if(a==0)return;
        System.out.println(a);
        fun(a-1);
    }
    public static void main(String[]args){
        fun(5000);
    }
}
