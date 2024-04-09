package oop;

class Marine{
    int hp=5; //체력
    static int df=5; //방어력
    static int att=5; //공격력
    public void info(){
        System.out.println("체력 : " + this.hp);
        System.out.println("방어력 : " + this.df);
        System.out.println("공격력 : " + this.att);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Marine m1 = new Marine();
        Marine m2 = new Marine();
        //현재 m1,m2의 체력, 방어력, 공격력 확인
        System.out.println("m1의 현재 상태");
        m1.info();

        System.out.println("m2의 현재 상태");
        m2.info();

        // m1이 공격당해 체력이 1로 감소
        m1.hp=1;
        System.out.println("m1이 공격당한 이후");
        System.out.println("m1의 현재 상태");
        m1.info();

        System.out.println("m2의 현재 상태");
        m2.info();

        //화학공장건설로 방어력과 공격력이 10으로 증가
        m1.df=10; // Marine.df=10
        m1.att=10; // Marine.att=10

        System.out.println("화학공강 건술 이후");
        System.out.println("m1의 현재 상태");
        m1.info();

        System.out.println("m2의 현재 상태");
        m2.info();

        System.out.pritln


    }
}
