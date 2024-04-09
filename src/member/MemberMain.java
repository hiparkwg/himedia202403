package member;

public class MemberMain {
    static MemberVo[] member = new MemberVo[10];
    static int cnt=0; //입력된 데이터 건수

    MemberMain(){
        MemberInput input = new MemberInput();
        MemberModify modify = new MemberModify();
        MemberDelete delete = new MemberDelete();
        MemberSearch search = new MemberSearch();

        //sample data 준비
        MemberVo v = new MemberVo();
        v.setId("a001");
        v.setIrum("hong");
        v.setAddress("오리");
        v.setPhone("010-1111-1111");
        member[0]= v;

        MemberVo v2 = new MemberVo("a001", "kim", "busan", "010-2222-2222");
        member[1] = v2;
        
        member[2] = new MemberVo("a003", "park","jeju", "010-33333-3333");
    }

    public static void main(String[] args) {
        new MemberMain();        
    }

}
