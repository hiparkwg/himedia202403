package collect;

import java.util.*;

public class HashMapEx1 {
    public void test(){
        Map<String, String> map = new HashMap<String, String>();
        //C(Create)
        map.put("hong", "1111");
        map.put("kim", "2222");
        map.put("lee", "3333");
        map.put("choi", "4444");
        map.put("kim", "8888");//중복 데이터
        System.out.println(map);

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("id, pwd를 입력하세요");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("pwd : ");
            String pwd = s.nextLine().trim();
            System.out.println();

            if( !map.containsKey(id) ) {
                System.out.println("id가 존재하지 않습니다.");
                continue;
            }else{
                String v = map.get(id); //id에 해당하는 value값 반환
                if(v.equals(pwd)){
                    System.out.println("방가~방가~");
                    break;
                }else{
                    System.out.println("아이디 또는 암호 확인 바람.");
                }
            }
        }
    }

    public static void main(String[] args) {
        HashMapEx1 m = new HashMapEx1();
        m.test();
    }
}
