class Student{
    int id;
    String name;
    void display(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }
}
public class ClassAndObjects{
    public static void main(String[]args){
        //creating objects
        Student s1 = new Student();

        //assigning values
        s1.id = 101;
        s1.name = "KAI";

        //calling methods
        s1.display();
    }
}