package collect;
import java.util.*;
public class HashSetEx2 {
    public void test(){
        Set set = new HashSet();
        // C(Create, insert)
        set.add("dog");
        set.add("cat");
        set.add("dog");
        set.add(new Person("홍길동", 20));
        set.add(new Person("홍길동", 20));
        set.add(new Person("일지매", 20));
        set.add(new Person("홍길동", 30));
        System.out.println(set);

        //R(Read, select, search)
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        //U(Update)
        Person p = new Person("일지매", 20);
        Iterator it2 = set.iterator();
        while(it2.hasNext()){
            Object o2 = it2.next();
            if(o2 instanceof Person){
                Person p2 = (Person)o2;
                if(p2.equals(p)){
                    p2.phone = "010-1111-1111";
                    p2.score =100;
                }
            }
        }
        System.out.println("수정후.....");
        System.out.println(set);
        
        //Update 두번째 방법
        p=new Person("일지매", 20);
        p.phone = "010-4444-4444";
        if(set.contains(p)){
            set.remove(p);
        }
        set.add(p);
        System.out.println("두번째 방법으로 수정 후.");
        System.out.println(set);

        
        //D(delete, remove)
        if(set.contains(p)){
            set.remove(p);
        }
        System.out.println("삭제후....");
        System.out.println(set);

    }
    public static void main(String[] args) {
        new HashSetEx2().test();
    }
}

class Person{
    String mName;
    int    age;
    String phone;
    int score;
    Person(String name, int age){
        this.mName = name;
        this.age = age;
    }
    public String toString(){
        return mName + ":" + age + ",phone=" + phone 
               + ", score=" + score ;
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