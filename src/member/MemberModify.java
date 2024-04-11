package member;
import java.util.*;
public class MemberModify {
    MemberModify(){
        Scanner s = new Scanner(System.in);
        System.out.println("**회원정보 수정**");

        System.out.print("수정할 회원 아이디 : ");
        String findId = s.nextLine();

        int pos = MemberSearch.find(findId);
        if(pos <0){
            System.out.println("회원의 정보가 없습니다.");
        }else{
            MemberVo vo = MemberMain.member[pos];
            System.out.println("아이디 : " + vo.getId());

            System.out.printf("성명 : %s >>> ", vo.getIrum());
            String irum = s.nextLine();
            
            System.out.printf("주소 : %s >>> ", vo.getAddress());
            String address = s.nextLine();

            System.out.printf("연락처 : %s >>>",  vo.getPhone());
            String phone = s.nextLine();

            
        }
    }
}
