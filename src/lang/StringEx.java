package lang;

public class StringEx {
    public void indexOf(){
        //문자열에서 특정 문자의 위치를 반환
        String str = "abcdef";
        int pos = str.indexOf("c");
        System.out.println("c의 위치:" + pos);
        int pos2 = str.indexOf("k");
        System.out.println("k의 위치=" + pos2);
    }

    public void substring(){
        //substring(x,y): x<= R < y 의 위치의 문자열 반환
        String jumin = "021225-4";
        String year = jumin.substring(0,2); //80
        String month= jumin.substring(2,4); //12
        String day  = jumin.substring(4,6); //25
        String gender=jumin.substring(7,8); //1

        gender = Integer.parseInt(gender)%2==0? "여자" : "남자";

        System.out.printf("생년 : %s\n", year);
        System.out.printf("생월 : %s\n", month);
        System.out.printf("생일 : %s\n", day);
        System.out.printf("성별 : %s\n", gender);

    }

    
    public void charAt(){
        //indexOf()반대기능
        String str ="abcdef";
        char c = str.charAt(3);
        System.out.println("charAt(3)=" + c);//d
    }
    
    public static void main(String[] args) {
        StringEx ex = new StringEx();
        ex.indexOf();
        ex.substring();
        ex.charAt();
        ex.replace();
    }
    public void replace(){
        //문자 바꾸기
        String str = "갈색 여우가 노을 속에서 다른 여우를 보고 웃고 있다.";
        String r = str.replace("여우", "fox");
        System.out.println(str);
        System.out.println(r);
    }
}
