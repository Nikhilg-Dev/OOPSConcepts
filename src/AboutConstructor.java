class Info{
    String name;
    int age;
    boolean student;
    public Info(String name,int age,boolean status ) {
        this.age=age;
        this.name=name;
        student=status; //// without this
    }


    public Info(Info p){   /////// copy constructor
        this.name=p.name;
        this.age=p.age;
        this.student= p.student;
    }


    public void printName(){
        System.out.println(name);
    }
    public void printAge(){
        System.out.println(age);
    }
    public void status(){
        System.out.println(student);
    }




}

public class AboutConstructor {
    public static void main(String[] args) {
        Info p1= new Info("nikhil",20,true);
        p1.printAge();
        p1.printName();
        p1.status();

        System.out.println("////////////////");

        Info p2=new Info("xyz",21,false);
        p2.status();

        System.out.println("////////////////");


        Info p3=new Info(p1); ///// copy constructor
        p3.printName();;
        p3.printAge();
        p3.status();




    }
}
