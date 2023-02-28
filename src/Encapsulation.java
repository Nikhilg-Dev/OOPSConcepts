class Upper{
    public void info(){
        System.out.println("message");
    }
    private  int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    protected void name(String name){
        System.out.println(name);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Upper u=new Upper();
        u.info();
//      u.age=20;    throw error
        u.setAge(20);
        System.out.println(u.getAge());
        u.name("nikhil");
    }
}
