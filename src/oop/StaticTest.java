package oop;

class Marine{
    int hp=5; //체력
    static int df=5; //방어력
    static int att=5; //공격력
}

public class StaticTest {
    public static void main(String[] args) {
        Marine m1 = new Marine();
        Marine m2 = new Marine();
        //현재 m1,m2의 체력, 방어력, 공격력 확인
        System.out.println("m1의 현재 상태");
        System.out.println("체력 : " + m1.hp);
        System.out.println("방어력 : " + m1.df);
        System.out.println("공격력 : " + m1.att);

        System.out.println("m2의 현재 상태");
        System.out.println("체력 : " + m2.hp);
        System.out.println("방어력 : " + m2.df);
        System.out.println("공격력 : " + m2.att);

        // m1이 공격당해 체력이 1로 감소
        m1.hp=1;
        System.out.println("m1이 공격당한 이후");
        System.out.println("m1의 현재 상태");
        System.out.println("체력 : " + m1.hp);
        System.out.println("방어력 : " + m1.df);
        System.out.println("공격력 : " + m1.att);

        System.out.println("m2의 현재 상태");
        System.out.println("체력 : " + m2.hp);
        System.out.println("방어력 : " + m2.df);
        System.out.println("공격력 : " + m2.att);

        //화학공장건설로 방어력과 공격력이 10으로 증가
        m1.df=10; // Marine.df=10
        m1.att=10; // Marine.att=10

        System.out.println("화학공강 건술 이후");
        System.out.println("m1의 현재 상태");
        System.out.println("체력 : " + m1.hp);
        System.out.println("방어력 : " + m1.df);
        System.out.println("공격력 : " + m1.att);

        System.out.println("m2의 현재 상태");
        System.out.println("체력 : " + m2.hp);
        System.out.println("방어력 : " + m2.df);
        System.out.println("공격력 : " + m2.att);



    }
}
