package oop;

class Tv{
    //메서드 선언
    // 접근자 반환값유형 메서드명(매개변수){}
    public void power(){
        System.out.println("전원이 켜짐.");
    }
    public void volumn(int x){
        System.out.printf("볼륨이 %s(으)로 지정됨\n", x);
    }
    public int  sound(){
        int s=1;
        s=100;
        return s;
    }
    public String model(String m){
        return "모델명은 " + m;
    }
}

public class MethodTest {
    public static void main(String[] args) {
        Tv myTv;
        myTv= new Tv();
        myTv.power();
        myTv.volumn(50);
        int sound = myTv.sound();
        System.out.println("sound:" + sound);
        String model = myTv.model("LG");
        System.out.println(model);

    }
}
