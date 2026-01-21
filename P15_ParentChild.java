class Parent{
    protected void parentMethod(){
        System.out.println("This is a method from the Parent class.");
    }
}
class Child extends Parent{
    public void childMethod(){
        System.out.println("This is a method from the Child class.");
    }
}
public class P15_ParentChild{
    public static void main(String[] args){
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        Parent p=new Parent();
        Child c=new Child();
        p.parentMethod();
        c.childMethod();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
    }
}