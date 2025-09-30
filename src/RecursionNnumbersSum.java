public class RecursionNnumbersSum {
    static int fun(int a){
        if(a==1) return 1;
        return a+fun(a-1);

    }
    public static void main(String[]args){
        System.out.println(fun(5));
    }
}
