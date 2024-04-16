/*
 * 예외 처리
 */

package excep;

public class TryTest {
    public void tryExam1(){
        int su=100;
        int n=10;
        try{
            int r = 100/n;
            System.out.println("r=" + r);
        }catch(Exception ex){//모든 예외가 발생하면
            //1)
            ex.printStackTrace();

            //2) 사용자가 전달한 메시지일수도 있음.
            System.out.println(ex.getMessage());

            //3)
            System.out.println("0으로 나눔...");
        }finally{
            System.out.println("무조건 실행됨.");
        }
    }
    public static void main(String[] args) {
        TryTest tt = new TryTest();
        tt.tryExam1();
        
    }
}
