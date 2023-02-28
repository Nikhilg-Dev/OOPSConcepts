class Parent{
    public void info(){
        System.out.println("Enter Details");
    }
}
class Information extends Parent{
    public void info(int age){
        System.out.println(age);
    }
    public String info(String name){
        return name;
    }
}
public class Polymorphism  {
    public static void main(String[] args) {
        Information p=new Information();
        System.out.println(p.info("nikhil"));
        p.info(20);
        p.info();


        Parent p1;
        p1=new Information();
        p1.info();
}
}
