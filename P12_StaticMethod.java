public class P12_StaticMethod {
    public static void main(String[] args) 
    {
       MyClass.MyStaticMethod(); // No need to create an object
       MyClass obj = new MyClass();
       obj.MyMethod1(); // Needs an object to call
       obj.MyMethod2(); // Needs an object to call
       System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
       
    }
}

class MyClass
{
    public static void MyStaticMethod()
    {
        System.out.println("This is a static method.");
    }
    
    public void MyMethod1()
    {
        System.out.println("Hi");
    }
    
    public void MyMethod2()
    {
        System.out.println("Hello");
    }
}
