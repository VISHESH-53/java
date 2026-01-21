// Class representing Address
class Address {
    String city, state, country;

    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return city + ", " + state + ", " + country;
    }
}

// Class representing Employee
class Employee {
    int id;
    String name;
    Address address; // HAS-A Relationship

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// Main Class
public class P22_Has_A {
    public static void main(String[] args) {
        Address address1 = new Address("Bangalore", "Karnataka", "India");
        Employee emp1 = new Employee(101, "Alice", address1);

        emp1.display();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    }
}
