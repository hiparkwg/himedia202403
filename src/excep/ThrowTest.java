/*
 * 예외 강제 발생시키기
 */
package excep;

public class ThrowTest {
    public void test(){

        int su=100;
        int n=5;

        //무조건 예외르 발생시킴
        try{
            throw new Exception("무조건 싫어~");
            //System.out.println(su/n);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("여기는 실행됨.");
    }

    public static void main(String[] args) {
        ThrowTest tt = new ThrowTest();
        tt.test();
    }
}
