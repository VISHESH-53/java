class P10_calculator{
    public static void main(String[] args) {
        addsub obj1 =new addsub();
        obj1.add();
        obj1.sub();

        muldiv obj2 =new muldiv();
        obj2.mul();
        obj2.div();
        System.out.println("\nVISHESH AGRAWAL\nJUUG24BTECH26683\n");
    }
}
 
class addsub{

    int a=10,b=5,c;
    public void add(){
        c=a+b;
        System.out.println(c);
    }
    public void sub(){
        c=a-b;
        System.out.println(c);
    }
}

class muldiv{

    int a=10,b=5,c;
    public void mul(){
        c=a*b;
        System.out.println(c);
    }
    public void div(){
        c=a/b;
        System.out.println(c);
    }
}