public class P18_ThisKeyword{
 public static void main(String[] args) {
 Person person = new Person("John", 25);
 person.displayInfo();
 System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
 }
}
class Person {
 private String name;
 private int age;
 public Person(String name, int age) {
 this.name = name; // 'this' refers to the current object's name
 this.age = age; // 'this' refers to the current object's age
 }
 public void displayInfo() {
 System.out.println("Name: " + this.name); // 'this' refers to the current object's

 System.out.println("Age: " + this.age); // 'this' refers to the current object's age
 
 }
}