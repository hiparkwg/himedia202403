package member;
import java.util.*;
public class MemberDelete {
    MemberDelete(){
        Scanner s = new Scanner(System.in);
        System.out.println("**회원정보 삭제**");
        System.out.print("삭제할 회원의 아이디 >>> ");
        String findId = s.nextLine();
        int pos = MemberSearch.find(findId);
        if(pos<0 ){
            System.out.println("삭제할 데이터를 찾지 못했습니다");
            return;
        }
        MemberVo vo = MemberMain.member[pos];
        System.out.println("성명 : " +  vo.getIrum());
        System.out.println("주소 : " + vo.getAddress());
        System.out.println("연락처 : " + vo.getPhone());
        System.out.print("정말 삭제하시겠습니까(y/n) >>> ");
        String flag = s.nextLine();
        if(flag.equals("y")){
            for(int i=pos ; i<MemberMain.cnt-1 ; i++){
                MemberMain.member[i] = MemberMain.member[i+1];
            }
            MemberMain.member[MemberMain.cnt] = null;
            MemberMain.cnt--;
        }
    }//생성자
}




