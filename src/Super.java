class Parent1 {
    String name="parent";
    public Parent1(){
        System.out.println("I am from Parent Constructor");
    }
    public void check(){
        System.out.println("Its Parent class method");
    }
}
class Child extends Parent1{
   String name=super.name;
   public Child(){
       super();        ////// child class constructor required
       super.check();  ////// needs function body either constructor or other methods
       System.out.println(" I am from Child Constructor");
   }
   public void check(){

       System.out.println("It child Class Method");
   }
}
public class Super {
    public static void main(String[] args) {
       Child c=new Child();
       c.check();
    }
}
