package member;
import java.util.*;
public class MemberSearch {
    MemberSearch(){
        Scanner s = new Scanner(System.in);
        System.out.println("**회원정보 조회**");
        //검색어 입력(아이디, 성명, 주소, 연락처)
        System.out.print("검색어 : ");
        String findStr = s.nextLine();

        System.out.println("-".repeat(40));
        System.out.println("No   아이디    성명      주소     연락처");
        System.out.println("-".repeat(40));
        for(int i=0 ; i<MemberMain.cnt ; i++){
            MemberVo vo = MemberMain.member[i];
            if(
                findStr.equals(vo.getId())        ||
                vo.getIrum().contains(findStr)    ||
                vo.getAddress().contains(findStr) ||
                vo.getPhone().contains(findStr)      ){            
                    System.out.printf("%4s", i+1);
                    System.out.printf("%10s", vo.getId());
                    System.out.printf("%10s", vo.getIrum());
                    System.out.printf("%10s", vo.getAddress());
                    System.out.printf("%15s", vo.getPhone());
                    System.out.println();
            }
        }

    }//생성자끝

    //회원의 아이디를 기준으로 한건의 데이터를 검색하여 그 위치를 반환
    public static int find(String findId){
        int pos = -1;//검색된 위치
        for(int i=0 ; i<MemberMain.cnt ; i++){
            MemberVo vo = MemberMain.member[i];
            if( vo.getId().equals(findId) ){
                pos = i;
                break;
            } 
        }
        return pos;
    }
}
