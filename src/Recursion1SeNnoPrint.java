public class Recursion1SeNnoPrint {
    static void fun(int a ){
        if(a==0)return;
        fun(a-1);
        System.out.println(a);
    }
    public static void main(String[]args){
        fun(5);
    }
}
