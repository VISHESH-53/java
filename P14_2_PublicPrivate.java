public class P14_2_PublicPrivate
{
 public static void main(String[] args)
 {
 AnotherClass obj = new AnotherClass();
 obj.MyMethod();
 System.out.println("Person's Name: " + obj.a);
 System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
 }
}
class AnotherClass
{
 private int a = 10;
 private void MyMethod()
 {
 System.out.println("My Method is Called");
 }
 
}