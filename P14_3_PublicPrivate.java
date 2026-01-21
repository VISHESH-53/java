public class P14_3_PublicPrivate
{
 public static void main(String[] args)
 {
 AnotherClass obj = new AnotherClass();

 //Trying to access the vairble directly os failed
 //System.out.println("Variable A Value: " + obj.a);

 obj.setMethod(10);
 System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
 }
}
class AnotherClass
{
 private int a = 20;

 public void setMethod(int i)
 {
 a = i;
 System.out.println(a);
 }
}
