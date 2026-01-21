// Parent Class
class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("Animal Type: " + type);
    }
}

// Child Class
class Dog extends Animal {
    String breed;

    Dog(String type, String breed) {
        super(type); // Calls the parent class constructor
        this.breed = breed;
    }

    void displayDetails() {
        super.display(); // Calls the parent class method
        System.out.println("Breed: " + breed);
    }
}

// Main Class
public class P23_Super{
    public static void main(String[] args) {
        Dog dog = new Dog("Mammal", "Golden Retriever");
        dog.displayDetails();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
