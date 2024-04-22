package collect;
import java.util.*;
public class ArraySort {
    List<Integer> data = new ArrayList<Integer>();
    
    public void asc(){
        data.add(1);
        data.add(2);
        data.add(9);
        data.add(7);
        data.add(5);
        //sort전
        System.out.println(data);//1 2 9 7 5
        //sort후
        Collections.sort(data);
        System.out.println(data);// 1 2 5 7 9


    }
    public void desc(){
        data.clear();

        data.add(9);
        data.add(1);
        data.add(5);
        data.add(8);
        data.add(3);

        Collections.sort(data);
        Collections.reverse(data);
        //내림차 정렬 후
        System.out.println(data);

    }

    // 홍길동, 일지매, 성춘향, 방자, 임걱정, 향단이
    // List에 저장한 후 이름순으로 정렬하여 출력
    public void test(){
        List<String> data = new ArrayList<String>();
        data.add("홍길동");
        data.add("일지매");
        data.add("성춘향");
        data.add("방자");
        data.add("임걱정");
        data.add("향단이");
        Collections.sort(data);
        System.out.println(data);

    }

    public static void main(String[] args) {
        ArraySort s = new ArraySort();
        s.asc();
        s.desc();
        s.test();
    }
}
