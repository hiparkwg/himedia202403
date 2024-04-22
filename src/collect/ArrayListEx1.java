package collect;
import java.util.*;
public class ArrayListEx1 {
    public void test1(){
        List list1 = new ArrayList(10);//기본 size 10개
        list1.add(new Integer(5));
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        List list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1, list2);

        //데이터 수정
        list2.set(3, "AA");
        print(list1, list2);

        //교집합
        list1.retainAll(list2);
        print(list1, list2);

        //검색하면서 삭제할 경우에는 리스트를 뒤에서부터 색인해야 함.
        //list2에서 list1에 있는 값 제거(차집합)
        for(int i=list2.size()-1 ; i>=0 ; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        list2.removeAll(list1);//차집합을 한번에.
        print(list1, list2);

    }
    public void print(List l1, List l2){
        System.out.println("list1=" + l1);
        System.out.println("list2=" + l2);
        System.out.println("-".repeat(50));
    }

    public static void main(String[] args) {
        ArrayListEx1 ex = new ArrayListEx1();
        ex.test1();
    }
}
