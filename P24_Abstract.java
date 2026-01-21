// Abstract Class
abstract class Shape {
    abstract void draw(); // Abstract method
}

// Concrete Class
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class P24_Abstract{
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
