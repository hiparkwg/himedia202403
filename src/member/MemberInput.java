package member;
import java.util.*;
public class MemberInput {
    MemberInput(){
        Scanner s = new Scanner(System.in);
     
        System.out.println("**회원정보 입력**");
        System.out.print("아이디 : ");
        String id = s.nextLine();

        System.out.print("성명 :");
        String irum = s.nextLine();

        System.out.print("주소 : ");
        String address = s.nextLine();

        System.out.print("연락처 : ");
        String phone = s.nextLine();

        MemberVo vo = new MemberVo(id, irum, address, phone);
        MemberMain.member[MemberMain.cnt] = vo;
        MemberMain.cnt++;
        











        /* 철거예정
        MemberVo vo = MemberMain.member[0];
        System.out.println(vo.getId());
        System.out.println(vo.getIrum());
        System.out.println(vo.getAddress());
        System.out.println(vo.getPhone());
        System.out.println("데이터 건수 : " + MemberMain.cnt);
        */


    }
}
