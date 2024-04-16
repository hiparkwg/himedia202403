/* 
 * 예외 던지기(throws)
 */
package excep;

public class ThrowsTest {
    public void one(){
        try{
            two();
        }catch(ArithmeticException ex){
            System.out.println("0으로 나눔.");
        }
    }
    public void two() throws ArithmeticException{
        int r=10/0;
    }

    public static void main(String[] args) {
        ThrowsTest tt = new ThrowsTest();
        tt.one();
    }
}
