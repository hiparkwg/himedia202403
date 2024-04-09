package oop;
class MyInfo{
    //필드선언은 일반 변수를 선언하는 방법과 동일
    //초기값을 선언하지 않아도 됨.
    //필드의 접근자는 보안성을 위해 private형으로 선언.
    private String name;
    private int    score;
    String info;
}

public class FieldTest {
    public static void main(String[] args) {
        MyInfo my = new MyInfo();
        my.info="나는 사용가능";
    }
}


