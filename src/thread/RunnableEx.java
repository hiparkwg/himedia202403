package thread;

public class RunnableEx{
    public RunnableEx(){
        Runnable r1 = new MyRunnable("길동이");
        Runnable r2 = new MyRunnable("춘향이");
        Runnable r3 = new MyRunnable("방자");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // thread
        t1.start();
        t2.start();
        t3.start();
        
        // non thread
        //r1.run();
        //r2.run();
        //r3.run();
    }

    public static void main(String[] args) {
        new RunnableEx();
    }
}

//작업스레드
class MyRunnable implements Runnable{
    String name;
    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=1; i<=100 ; i++){
            System.out.printf("%s=%d\n", this.name, i);
            try{
                Thread.sleep(50);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
