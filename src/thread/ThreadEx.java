package thread;

public class ThreadEx {
    public ThreadEx(){
        Thread t1 = new MyThread("길동이");
        Thread t2 = new MyThread("춘향이");
        Thread t3 = new MyThread("방자");

        t1.start();
        t2.start();
        t3.start();
    }
    public static void main(String[] args) {
        new ThreadEx();
    }
}
class MyThread extends Thread{
    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for(int i=1 ; i<=100; i++){
            System.out.println(name + "=" + i);
            try{
                Thread.sleep(50);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
