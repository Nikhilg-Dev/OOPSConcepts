class Test{
    final int number=5;
    public final void info(){
        System.out.println("its a final method");
    }

}
//final class Result1{
//
//}
//class Test1 extends Result1{   ///// cant extend final classs
//
//}
class Result extends Test{

//   public void info(){     ////// cant override final method
//       System.out.println(" messege");
//   }
}
public class Final {
    public static void main(String[] args) {
        Test t=new Test();
//        t.number=10;  //// cant change /// compile time error
        t.info();
    }

}
