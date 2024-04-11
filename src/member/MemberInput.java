package member;

public class MemberInput {
    MemberInput(){
        System.out.println("**회원정보 입력**");
        MemberVo vo = MemberMain.member[0];
        System.out.println(vo.getId());
        System.out.println(vo.getIrum());
        System.out.println(vo.getAddress());
        System.out.println(vo.getPhone());
    }
}
