package collect;
import java.util.*;
public class HashMapEx2 {
    public void test(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("kim", 90);
        map.put("kim", 100);//중복데이터
        map.put("lee", 100);
        map.put("kang", 80);
        map.put("ahn", 90);
        System.out.println(map);

        //모든 요소를 Map.Entry로 반환처리
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.printf("이름 : %-5s 점수 : %6d\n", 
                                e.getKey(), e.getValue() );
        }
        // 모든 key를 반환
        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        // 모든 value만 반환
        Collection values = map.values();
        it = values.iterator();
        int total=0;
        while(it.hasNext()){
            Integer i=(Integer)it.next();
            total += i.intValue();
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total/(double)set.size());
        System.out.println("초고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));

        //이름을 입력하여 점수 확인
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("아이디(enter=exit) ? ");
            String key = s.nextLine().trim();
            if(key.equals("")) break;
            if(map.containsKey(key)){
                Integer v = map.get(key);
                System.out.printf("아이디 : %-6s 점수 : %6d\n\n", key, v);
            }
        }

    }
    public static void main(String[] args) {
        HashMapEx2 e = new HashMapEx2();
        e.test();
    }
}
