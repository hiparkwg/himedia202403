package lang;
import java.util.*;

public class RandomTest {
    public void test(){
        // seed값이 없는 경우
        Random r1 = new Random();
        for(int i=0;i<6; i++){
            int k = r1.nextInt(45)+1;
            System.out.printf("%4d", k);//서로다른 난수
        }                
        System.out.println();

        // seed값이 있는 경우
        Random r2 = new Random(100);
        for(int i=0; i<6; i++){
            int k = r2.nextInt(45)+1;
            System.out.printf("%4d", k);// 같은 난수
        }


    }
    public static void main(String[] args) {
        RandomTest t = new RandomTest();
        t.test();
    }
}
