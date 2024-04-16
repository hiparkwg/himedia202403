/*
 * 내부 클래스(인스턴스형) 
 */
package inheri;

public class InnerClassTest {
    // 다중처리를 위한 스레드 생성
    class NumberThread implements Runnable{
        @Override
        public void run() {
            int cnt=0;
            while(cnt<50){
                System.out.println(cnt);
                try{
                    Thread.sleep(10);
                    cnt++;
                }catch(Exception ex){}
            }
        }
    }
    public InnerClassTest(){
        //NumberThread nt = new NumberThread();
        Runnable     r  = new NumberThread();
        Thread t = new Thread(r);
        t.start();

    }

    public static void main(String[] args) {
        new InnerClassTest();
    }
}
