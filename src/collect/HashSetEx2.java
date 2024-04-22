package collect;
import java.util.*;
public class HashSetEx2 {
    public void test(){
        Set set = new HashSet();
        set.add("dog");
        set.add("cat");
        set.add("dog");
        set.add(new Person("홍길동", 20));
        set.add(new Person("홍길동", 20));
        System.out.println(set);

    }
    public static void main(String[] args) {
        new HashSetEx2().test();
    }
}

class Person{
    String mName;
    int    age;
    Person(String name, int age){
        this.mName = name;
        this.age = age;
    }
    public String toString(){
        return mName + ":" + age;
    }

    @Override
    public int hashCode(){
        return mName.hashCode() + age;
    }
    public boolean equals(Object o){
        boolean b=false;
        if( o instanceof Person){
            Person p = (Person)o;
            if(this.mName.equals(p.mName) && this.age == p.age){
                b =true;
            }
        }

        return b;
    }


}