class Cars{
    public void childMethod(){
        System.out.println("CARS:-\n");
    }
}
class Ferrari extends Cars{
    @Override
    public void childMethod(){
        System.out.println("Ferrari");
    }
}
class Lamborghini extends Cars{
    @Override
    public void childMethod(){ 
        System.out.println("Lamborghini");
    }
}   
class Toyota extends Cars{
    @Override
    public void childMethod(){
        System.out.println("Toyota");
    }
}
public class P19_Inheritance{
    public static void main(String[] args){

        Cars obj;
        obj = new Cars();
        obj.childMethod();
        obj= new Ferrari();
        obj.childMethod();
        obj = new Lamborghini();
        obj.childMethod();
        obj = new Toyota();
        obj.childMethod();
        System.out.println("\n\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
    }  
}