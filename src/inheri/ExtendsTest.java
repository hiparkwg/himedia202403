/*
 * extends로 상속받는 방법
 */
package inheri;

class Dog{
    Dog(){
        System.out.println("강아지");
    }
    public String run(){
        return "달리고 있는중.";
    }
}


public class ExtendsTest extends Dog{
    public static void main(String[] args) {
        ExtendsTest et = new ExtendsTest();
        System.out.println(et.run());
    }
}
