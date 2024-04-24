package thread;

public class DeamonTest {
    public static void main(String[] args) {
        System.out.println("메인 스레드 시작...");
        Thread t = new JobThread();
        t.setDaemon(true);
        t.start();
        try{
            Thread.sleep(1000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("메인 스레드 종료");
    }
}
class JobThread extends Thread{
    public void run(){
        for(int i=1 ; i<=200; i++){
            System.out.printf("%3d", i);
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
