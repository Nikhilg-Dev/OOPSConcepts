import java.util.ArrayList;

class MyThread extends Thread{


    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
class RunnableThread implements Runnable{
    String name;

    public RunnableThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        printNu(5);
    }
    ArrayList<Integer>arr=new ArrayList<>();
    synchronized void printNu(int n){  //synchronized method
        for(int i=1;i<=n;i++){
            System.out.println(i+ name);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

public class MultiThreading  {
    public static void main(String[] args) {
//        MyThread myThread1=new MyThread();
//        MyThread myThread2=new MyThread();
//        myThread1.start();
//        myThread2.start();
        RunnableThread runnableThread1=new RunnableThread("Thread1");
        RunnableThread runnableThread2=new RunnableThread("Thread2");
        Thread thread1=new Thread(runnableThread1);
        Thread thread2=new Thread(runnableThread2);
        thread1.start();
        thread2.start();

    }
}
