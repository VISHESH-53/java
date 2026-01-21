// High Cohesion: Each class has a single responsibility.
class Payment {
    void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

class Order {
    private Payment payment;

    // Low Coupling: Dependency injected via constructor.
    Order(Payment payment) {
        this.payment = payment;
    }

    void placeOrder() {
        System.out.println("Order placed.");
        payment.processPayment(100.0);
    }
}

public class P29_Low_coupling_High_cohesion {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Order order = new Order(payment); // Loose coupling
        order.placeOrder();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
