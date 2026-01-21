class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class P27_Static_Polymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of two integers: " + calc.add(10, 20)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5)); // Calls add(double, double)
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
