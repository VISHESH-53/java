class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class P28_Dynamic_Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal; // Parent class reference

        myAnimal = new Dog(); // Reference to Dog object
        myAnimal.sound(); // Outputs: "Dog barks"

        myAnimal = new Cat(); // Reference to Cat object
        myAnimal.sound(); // Outputs: "Cat meows"
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
