/*
 * 동기화 작업 테스트
 */
package thread;
import java.util.*;

public class AsyncTest {
    public AsyncTest(){
        Bank bank = new Bank();
        Thread mom = new Family(bank, "엄마");
        Thread dal = new Family(bank, "딸");
        Thread son = new Family(bank, "아들");

        mom.start();
        dal.start();
        son.start();
    }
    public static void main(String[] args) {
        new AsyncTest();
    }
}

//공유자원
class Bank{
   int amt=30000; 
   
   //동기화처리
   synchronized public void output(int a){

    if(a<=amt){
        try{
            Thread.sleep(150);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        amt -= a;
    }
   }
}
class Family extends Thread{
    Bank bank;
    String who;
    public Family(Bank b, String who){
        this.bank = b;
        this.who = who;
    }
    
    public void run(){
        Random r = new Random();
        for(int i=0; i<20; i++){

            int amt = r.nextInt(2000)+100;
            bank.output(amt);

            System.out.printf("%s님의 출금 %d, 잔액:%d\n",
                                who, amt, bank.amt);
        }
    }
    
}
