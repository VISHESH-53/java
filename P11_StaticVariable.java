public class P11_StaticVariable {
        static int count = 0;
    void createObject(){
        count++;
	}
    void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
    public static void main(String[] args) {
        P11_StaticVariable obj1 = new P11_StaticVariable();
        P11_StaticVariable obj2 = new P11_StaticVariable();
        obj1.createObject(); 
        obj1.displayCount();
        obj2.createObject(); 
        obj2.displayCount();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
    }
}
