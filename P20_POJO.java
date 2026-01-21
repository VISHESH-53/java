public class P20_POJO { 
    public static void main(String[] args){ 
    POJO obj= new POJO(); 
    obj.setName("Alisha"); // Setting the values using the set() method 
    obj.setId("A001"); 
    obj.setSal(200000); 
 
    System.out.println("Name: "+ obj.getName()); //Getting the values using the get() 
    System.out.println("Id: " + obj.getId()); 
    System.out.println("Salary: " +obj.getSal()); 
    System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683");
    } 
}
class POJO { 
    private String name; 
    private String id; 

    private double sal; 
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name = name; 
    } 
    public String getId() { 
        return id; 
    } 
    public void setId(String id) { 
        this.id = id; 
    } 
    public double getSal() { 
        return sal; 
    } 
    public void setSal(double sal) { 
        this.sal = sal; 
    } 
} 