class P17_ChainingExample{
    P17_ChainingExample(){
        System.out.println("No-arg Constructor");
    }
    P17_ChainingExample(String name){
        this();
        System.out.println("Single-arg Constructor: " + name);
    }
    P17_ChainingExample(String name, int age){
        this(name);
        System.out.println("Two-arg Constructor: Name = " + name + ", Age = "+ age);
    }
    public static void main(String[] args){
        P17_ChainingExample obj = new P17_ChainingExample("Alice", 25);
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
    }
}