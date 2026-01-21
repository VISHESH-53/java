interface Drawable{
    void draw();
}

interface Colorable{
    void color();
}

class Rectangle implements Drawable, Colorable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    public void color(){
        System.out.println("Coloring Rectangle");
    }
}

class Circle implements Drawable, Colorable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public void color(){
        System.out.println("Coloring Circle");
    }
}

public class P25_Interface{
    public static void main(String[] args) {
               Drawable d = new Rectangle();
               d.draw();
               Drawable d2 = new Circle();
               d2.draw();
               Colorable c = new Rectangle();
               c.color();
               Colorable c2 = new Circle();
               c2.color();
               System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683"); 
    }
}