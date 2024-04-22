package collect;

import java.util.*;

public class IteratorEx1 {
    public void test(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
    public static void main(String[] args) {
        new IteratorEx1().test();
    }
}
