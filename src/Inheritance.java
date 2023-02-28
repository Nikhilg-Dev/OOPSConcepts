class Shape1{
    public void area(){
        System.out.println(" Acquire some area ");
    }
}
class Quadrilateral1 extends  Shape1{
    static final int side=4;
    public void numberOfSides(){
        System.out.println("it has "+side+" sides");
    }
}
class Square extends Quadrilateral1{
    int number10;
    int sides=super.side;
    int length;
    public Square(int length){
        this.length=length;
    }

    public void area() {
        System.out.println(length*length);
    }
}
class Triangle1 extends Shape1{
    static final int side=3;
    public void numberOfSides(){
        System.out.println("it has "+side+" sides");
    }

}
class RightAngleTriangle extends Triangle1{

    int sides=super.side;
    int perpendicular;
    int base;

    public RightAngleTriangle(int perpendicular,int base) {
        this.perpendicular=perpendicular;
        this.base=base;
    }

    public void area() {
        System.out.println(0.5*perpendicular*base);
    }
}


public class Inheritance {
    public static void main(String[] args) {
//        Triangle1 r=new RightAngleTriangle(10,8);
//        r.area();
//        r.numberOfSides();
//
//        Quadrilateral1 q=new Square(4);
//        q.area();
//        q.numberOfSides();

        Pojo p=new Pojo();

        System.out.println(p.getName());
    }
}
