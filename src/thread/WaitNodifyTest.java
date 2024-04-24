package thread;

public class WaitNodifyTest {
    public static void main(String[] args) {
        StringBuilder desk = new StringBuilder();
        Thread buy = new BuyThread(desk);
        Thread fac = new Factory(desk);

        buy.start();// 빵을 사러감.
        try{
            Thread.sleep(1);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        fac.start();// 빵 공장을 이제 가동.

    }
}
// 빵을 사러운 고객
class BuyThread extends Thread{
    StringBuilder sb;
    public BuyThread(StringBuilder sb){
        this.sb = sb;
    }

    public void run(){
        System.out.println("1) 빵을 사러옴...");
        synchronized(sb){
            System.out.println("2) 빵이 나올때까지 기다림.");
            if(sb.length()==0){//빵이 없다면
                try {
                    sb.wait();
                    System.out.println("3) 빵을 구매함.");
                    System.out.println(sb.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//빵을 만드는 공장
class Factory extends Thread{
    StringBuilder sb;
    public Factory(StringBuilder sb){
        this.sb = sb;
    }
    public void run(){
        System.out.println("4) 빵을 만들기 시작함....");
        synchronized(sb){
            sb.append("슈크림빵 100개");
            try{
                Thread.sleep(2000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            System.out.println("5) 빵을 모두 생산함....");
            sb.notify();//빵을 사도록 자고 있는 손님을 깨움.
        }
    }
}
