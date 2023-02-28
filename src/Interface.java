interface Shape{
    int types=16;

    void area();


}
class Triangle implements Shape{
    public static void info(){
        System.out.println("messege");
    }

    public void area(){
        System.out.println("0.5 * base * height");
    }

}


class Sqaure implements Shape{
    public void area(){
        System.out.println("Side * Side");
    }
}
public class Interface {
    public void main(String[] args) {
        Shape s1= new Triangle();
        Shape s2=new Sqaure();
        s1.area();
        s2.area();
        Triangle.info();
//      Shape.types=3;      // throw error
        System.out.println(Shape.types);


    }
}
