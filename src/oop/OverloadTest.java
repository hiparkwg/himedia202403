package oop;

public class OverloadTest {
    //생성자의 오버로딩
    OverloadTest(){
        System.out.println("매개 변수가 없는 생성자");
    }
    OverloadTest(int x){
        System.out.println("정수형 매개변수 1개");
    }
    OverloadTest(String str){
        System.out.println("문자열형 매개변수 1개");
    }
    OverloadTest(int k, double h){}
    OverloadTest(double h , int k){}

    public static void main(String[] args) {
        OverloadTest t = new OverloadTest();
        OverloadTest t2 = new OverloadTest("park");

    }

}
