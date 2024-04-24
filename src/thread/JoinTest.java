package thread;

public class JoinTest {
    public static void main(String[] args) {
        System.out.println("주 스레드 작업 시작");
        Thread t = new SubThread();
        t.start();

        for(char c= 'a'; c<='z' ; c++){
            System.out.printf("%3c", c);
        }
        System.out.println();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("주 스레드 작업 완료");
    }
}

class SubThread extends Thread{
    public void run(){
        for(int i=1 ; i<=100; i++){
            System.out.printf("%4d", i);
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println();
    }
}
