import java.util.*;
public class ExceptionHandling {
    public static void myArray(int []arr){
        try {
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Program Ended");
        }
    }
    public static void info(String name) throws MyException {
        if(name=="nikhil"){
            throw new MyException();
        }
        else{
            System.out.println(name);

        }
    }

    public static void main(String[] args) throws MyException {
        int []arr={1,2,3,4,5};
        myArray((arr));
        String name="nikhil";
        try {
            info(name);
        }catch (MyException me){
            System.out.println(me);
        }



    }
}
