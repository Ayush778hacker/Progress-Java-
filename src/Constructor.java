class ClassName{
    int id;
    String name;

    ClassName(int i, String n){
        id = i;
        name = n;
    }
    void showInfo(){
        System.out.println("id: " + id + " name: " + name);
    }
}

public class Constructor {
    public static void main(String[]args){
        ClassName s1 = new ClassName(101,"KAI");
        ClassName s2 = new ClassName(102,"KI");

        s1.showInfo();;
        s2.showInfo();
    }
}
