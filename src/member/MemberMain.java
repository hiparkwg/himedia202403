package member;

import java.util.*;


public class MemberMain {
    static MemberVo[] member = new MemberVo[10];
    static int cnt=7; //입력된 데이터 건수

    MemberMain(){

        //sample data 준비
        MemberVo v = new MemberVo();
        v.setId("a001");
        v.setIrum("hong");
        v.setAddress("오리");
        v.setPhone("010-1111-1111");
        member[0]= v;

        MemberVo v2 = new MemberVo("a002", "kim", "busan", "010-2222-2222");
        member[1] = v2;

        member[2] = new MemberVo("a003", "park","jeju", "010-33333-3333");
        member[3] = new MemberVo("a004", "park","jeju", "010-33333-3333");
        member[4] = new MemberVo("a005", "park","jeju", "010-33333-3333");
        member[5] = new MemberVo("a006", "park","jeju", "010-33333-3333");
        member[6] = new MemberVo("a007", "park","jeju", "010-33333-3333");
    }

    // 메뉴를 입력받아 작업 진행
    public void start(){
        Scanner s = new Scanner(System.in);
        boolean flag=true; //true일 때 반독, false일 때 작업중단
        while(flag){
            System.out.println("*** 회원관리 ***");
            System.out.println("-".repeat(40));
            System.out.print("1=입력, 2=수정, 3=조회, 4=삭제, 0=종료 >>>");
            String menu = s.nextLine();
            switch(menu){
                case "0" : flag=false;break;
                case "1" : new MemberInput();  break;
                case "2" : new MemberModify(); break; 
                case "3" : new MemberSearch(); break;
                case "4" : new MemberDelete(); break;
            }
        }
    }

    public static void main(String[] args) {
        new MemberMain().start();        
    }

}
