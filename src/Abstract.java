abstract class Quadrilateral {
     static int sides=4;
    abstract void area();
    public boolean parallelSides(){
        return true;
    }

}
class Rhombus extends Quadrilateral {
    public void area(){
        System.out.println("base * height");
    }

}
public class Abstract {
    public static void main(String[] args) {
        System.out.println(Quadrilateral.sides);

        Quadrilateral.sides=10;
        System.out.println(Quadrilateral.sides);

        Quadrilateral r=new Rhombus();
        System.out.println(r.parallelSides());



    }
}
