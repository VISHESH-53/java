interface Greeting {
    void sayHello();
}

public class P26_AnonymousInner {
    public static void main(String[] args) {
        // Creating an anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        greeting.sayHello(); // Calling the method
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
