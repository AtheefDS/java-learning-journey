/*class MyThread extends Thread{
    public void run(){
        for (int i=0 ; i<=5 ; i++){
            System.out.println("Thread: " +i);
        }
    }
}

public class thread {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
*/
class ThreadTester{
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0 ; i<5 ; i++){
            System.out.println("My Thread");
        }
    }
}