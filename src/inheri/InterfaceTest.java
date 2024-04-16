/* 
 * interface 구현하기
 */
package inheri;

//인터페이스안에는 상수와 추상메서드만이 존재할 수 있음.
interface Animal{
    String color="white";//상수화됨
    String getColor();//추상 메서드(abstract가 자동으로 추가됨)
}
public class InterfaceTest implements Animal{

    @Override
    public String getColor() {
        //this.color = "black"; //불가
        return this.color;
    }

    public static void main(String[] args) {
        //두 가지의 객체 생성 방법
        InterfaceTest it = new InterfaceTest();
        System.out.println(it.getColor());

        Animal an = new InterfaceTest();
        System.out.println(an.getColor());
    }
    
}
