/*
 * super(), super, this(), this
 */
package inheri;

class Cat{
    String color="white";
    public Cat(String color){
        this.color = color;
        System.out.println("Cat() : " + color);
    }
    public String getColor(){
        return this.color;
    }
}

public class SuperTest extends Cat {
    String color="black";
    public SuperTest(){
        super("red");//부모 생성자 call
        String str="";
        //super("yellow");//반드시 첫번째 문장에서만 가능
    }
    public String getColor(){
        //super("yellow");//일반 메서드에서는 사용 불가
        //return this.color;
        return super.color;
    }

    public static void main(String[] args) {
        SuperTest st = new SuperTest();
        System.out.println(st.getColor());
    }
}

