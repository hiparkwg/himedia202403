/*
 * Map을 사용한 PhoneBook CRUD
 */
package collect;
import java.util.*;
public class PhoneBookMap {
    Map phoneBook = new HashMap();
    Scanner s;
    public PhoneBookMap(){
        // sample data
        addPhoneNo("친구", "hong", "1111");
        addPhoneNo("친구", "kim", "2222");
        addPhoneNo("친구", "park", "3333");
        addPhoneNo("회사", "choi", "4444");
        addPhoneNo("회사", "nam", "5555");

        s = new Scanner(System.in);
        while(true){
            System.out.print("메뉴[1.=입력 2=수정 3=조회 4=삭제 0=종료] >>> ");
            String menu = s.nextLine();
            if(menu.equals("0")) break;
            switch(menu){
                case "1" : insert();break;
                case "2" : update();break;
                case "3" : search();break;
                case "4" : delete();break;
            }

        }

    }
    public void insert(){
        String group="";
        String name = "";
        String tel = "";
        String yn = "";
        System.out.println("전화번호부 작성");
        System.out.print("그룹 : ");
        group = s.nextLine().trim();

        System.out.print("성명 : ");
        name = s.nextLine().trim();

        System.out.print("연락처 : ");
        tel = s.nextLine().trim();
        System.out.print("저장 하시겠습니까(y/n) ?");
        yn = s.nextLine();
        if(yn.equals("y")){
            if(group.equals("")){
                addPhoneNo(name, tel);
            }else{
                addPhoneNo(group, name, tel);
            }
        }
    }

    // 이름또는 연락처로 검색
    public void search(){
        printList();
    }

    // 이름으로 검색한 연락처를 사용하여 기존 데이터는 삭제하고
    // 새로운 연락처를 추가.
    public void update(){
        System.out.print("수정할 회원의 이름은 ? ");
        String findName = s.nextLine();



        Iterator it = phoneBook.keySet().iterator();
        while(it.hasNext()){
            String group = (String)it.next();
            HashMap subMap = (HashMap)phoneBook.get(group);
            Iterator it2 = subMap.keySet().iterator();
            while(it2.hasNext()){
                String key = (String)it2.next(); // 연락처
                String value = (String)subMap.get(key); // 이름
                if(value.equals(findName)){
                    System.out.println("연락처 : " + key);
                    System.out.print("수정할 연락처 : ");
                    String phone = s.nextLine().trim();
                    if( !phone.equals("") ){
                        subMap.remove(key);//기존값 삭제
                        subMap.put(phone, value); //수정된 데이터로 추가
                        break;
                    }
                }

            }


        }

    }
    public void delete(){
        System.out.print("삭제할 회원의 이름 : ");
        String delName = s.nextLine();
        Iterator it = phoneBook.keySet().iterator();
        while(it.hasNext()){
            String group = (String)it.next();
            HashMap subMap = (HashMap)phoneBook.get(group);
            Iterator it2 = subMap.keySet().iterator();
            while(it2.hasNext()){
                String key = (String)it2.next();
                String value = (String)subMap.get(key);
                if(value.equals(delName)){
                    System.out.println("연락처 : " + key);
                    System.out.print("정말 삭제(y/n) ? ");
                    String yn = s.nextLine();
                    if(yn.equals("y")){
                        subMap.remove(key);
                        break;
                    }
                }
            }

        }

    }

    public void addPhoneNo(String groupName, String name, String tel){
        //System.out.printf("%s %s %s\n",groupName, name, tel );
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel, name);
    }
    public void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }
    public void addGroup(String groupName){
        if( !phoneBook.containsKey(groupName) ){
            phoneBook.put(groupName, new HashMap());
        }
    }
    public void printList(){
        //System.out.println(phoneBook.keySet()); // 그룹명만 출력
        System.out.print("검색어 >>> ");
        String findStr = s.nextLine();

        Set set = phoneBook.keySet(); // 친구, 회사, 기타, 웬수
        Iterator it = set.iterator();
        while(it.hasNext()){
            String group = (String)it.next();
            HashMap subMap = (HashMap)phoneBook.get(group);
            System.out.printf("%s[%d]\n", group, subMap.size());
            Iterator it2 = subMap.keySet().iterator();
            while(it2.hasNext()){
                String key = (String)it2.next();
                String v = (String)subMap.get(key);
                if(key.contains(findStr) 
                    || v.contains(findStr)
                    || findStr.equals("") ){
                    System.out.printf("%s - %s\n", key, v);
                }
            }
        }
    }

    public static void main(String[] args) {
        PhoneBookMap p = new PhoneBookMap();

    }
}
