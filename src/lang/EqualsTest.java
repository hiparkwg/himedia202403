/*
 * Object.equals 재정의
 */
package lang;

class Person{
    long id;
    public Person(long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if( obj instanceof Person){
            return this.id == ((Person)obj).id;
        }else{
            return false;
        }
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person(10L);
        Person p2 = new Person(10L);
        System.out.println(p1);//hashCode
        System.out.println(p2);//hashCode
        if(p1==p2){
            System.out.println("p1,p2는 동일한 객체");
        }else{
            System.out.println("p1, p2는 다른 객체");
        }

        if(p1.equals(p2)){
            System.out.println("p1,p2는 아이디가 동일해서 같은 객체");
        }else{
            System.out.println("p1, p2는 아이디가 다르므로 다른 객체");

        }



    }
}
