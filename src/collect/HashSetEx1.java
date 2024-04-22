package collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
    public void test(){
        Object[] obj={"1", new Integer(1), "2","2", "3","3", "3", "4"};
        Set<Object> set = new HashSet<Object>();

        // C(Create, insert )
        for(Object o : obj){
            set.add(o);
        }
        System.out.println(set);
        //R(Read, select)
        Iterator<Object> it = set.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        //D(delete, remove)
        set.remove("4");
        System.out.println(set);

    }
    public static void main(String[] args) {
        new HashSetEx1().test();
    }
}
