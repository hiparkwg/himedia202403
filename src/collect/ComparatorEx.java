package collect;
import java.util.*;
public class ComparatorEx {
    public void asc(){
        String[] str ={"cat", "Dog", "lion", "tiger"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        //대소문자 구별없이 정렬
        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(str));

        //내림차 정렬(Desc에 정의된 방법대로 정렬해줘)
        Arrays.sort(str, new Desc());
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        new ComparatorEx().asc();
    }
}

class Desc implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int r=-1;
        if(o1 instanceof Desc && o2 instanceof Desc){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            r = c1.compareTo(o2)*-1;
        }
        return r;
    }

}
