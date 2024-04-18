package lang;

public class StringSpeedTest {
    public void speedTest(){
        System.out.println("start");
        String a="";
        long start = System.currentTimeMillis();
        for(int i=0; i<99999; i++){
            a += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("경과시간 : " + (end-start));

        //StrinbBuilder test.....
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for(int i=0 ; i<99999; i++){
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("경과시간 : " + (end-start));




    }
    public static void main(String[] args) {
        StringSpeedTest t = new StringSpeedTest();
        t.speedTest();
    }
}
