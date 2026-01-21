import java.util.Scanner;

class area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the base (length) of the triangle: ");
        double base = scan.nextDouble();
        
        System.out.println("Enter the height of the triangle: ");
        double height = scan.nextDouble();
        
        double area = (base * height) / 2;
        
        System.out.println("The area of the triangle is: " + area);
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");

        
        scan.close();
    }
}
