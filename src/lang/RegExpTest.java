package lang;

import java.util.Scanner;
import java.util.regex.*;

public class RegExpTest {

    public void normal(){
        String[] data = {"bat","baby","bonus","cA", "co", "ca", "c.", "c0",
                         "car", "combat","count","date", "disk"
                        };
        
        //c로시작하고 영소문자만으로 이루어진 데이터
        Pattern p = Pattern.compile("c[a-z]*");

        // 영소문자의 2자리이면서 c로시작함.
        p = Pattern.compile("c[a-z]");//co, ca

        // 영소문자로 이루어지 1~10자까지의 문자열
        p = Pattern.compile("[a-z]{1,10}");

        // c로 시작하고 뒤자리는 모두 숫자인 문자열
        p = Pattern.compile("c[0-9]*");

        // 영문자가 5자리인 데이터//bonus, count
        p = Pattern.compile("[a-zA-Z]{5}");


        for(int i=0 ; i<data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches()){
                System.out.printf( "%s, ", data[i] );
            }
        }
    }
    public void number(){
        String pattern="[0-9]+"; // or "\\d+"
        String[] data = {
            "123", "123a", "a123","한글1", "ㄱ123", "(123)@#"
        };
        for(String s : data){
            boolean b = Pattern.matches(pattern, s);
            System.out.printf("%s -> %b\n", s, b);
        }
    }

    public void alpha(){
        String[] data = {
            "123", "a123", "abc","abc*&()", "한글abc", "a b",
            "abcABC", "abAB123"
        };
        String pattern = "[a-zA-Z]+"; // \\w+
        for(String s : data){
            boolean b = Pattern.matches(pattern, s);
            System.out.printf("%s -> %b\n", s, b);
        }

    }
    public void hangul(){
        String[] data ={
            "123","adb","강아지","강아지123","강아지abc",
            "강아지*()", "강아지ㅁㄹㅁ", "개나리", "박원기",
            "ㅂㅈㄷㄱ", "ㅛㅕㅑㅐㅔ"
        };
        String pattern = "[ㄱ-ㅎㅏ-ㅞ가-휗]+";
        for(String s : data){
            boolean b = Pattern.matches(pattern, s);
            System.out.printf("%s -> %b\n", s, b);
        }
    }

    public void phone(){
        String[] data = {
            "1-123-1234", "1-1-1", "02-1-123","02-1234-12345",
            "02-123-1234", "031-113-1234", "010-1-1234",
            "010-1234-1234","1234-123-123","123-12345-1234"
        };
        String pattern = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
        for(String s : data){
            boolean b = Pattern.matches(pattern, s);
            System.out.printf("%s -> %b\n", s, b);
        }
    }
    public void email(){
        String[] data = {
            "a@abc.com", "123@abc.com", "abc.com@kr",
            "abc@naver.com", "abc123@naver.com", "abc123!@abc.com",
            "abc@a.b.c.d", "abc@naver,com","abc@naver!.com",
            "abc@chosun.co.kr"
        };
        String pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?$";
        for(String s : data){
            boolean b = Pattern.matches(pattern,s);
            System.out.printf("%s -> %b\n", s, b);
        }
    }

    // 키보드를 사용하여 아이디와 암호를 입력받아 규정에 맞는지 체크
    public void exam(){
        String[] id={
            "가나다111222", "abcdabcd", "a123", "a12345678901234",
            "abcd1234", "abcde1234567","23123asdfASDF&"
        };
        String[] pwd={
            "a123456789", "a123456789&", "a123", "Aa1234567&",
            "aB123456789123456!", "abAB!"
        };

        // 아이디 : 8~12사이의 영숫자만. 단 영어로 시작.
        String idPattern = "^[a-zA-Z][\\w]{7,11}$";

        // 암호:8~15자 사이의 영숫자, 단 대문자와 !#%& 기호 포함
        String pwdPattern = "(?=.*[A-Z!#%&])[a-zA-Z0-9!#%&]{8,15}$";
        
        Scanner s = new Scanner(System.in);
        
        // id check
        System.out.println("id check------------");
        for(int i=0 ; i<id.length ; i++){
            boolean b = Pattern.matches(idPattern, id[i]);
            System.out.printf("%s -> %b\n", id[i], b);

        }

        // pwd check
        System.out.println("password check----------");
        for(int i=0 ; i<pwd.length ; i++){
            boolean b = Pattern.matches(pwdPattern, pwd[i]);
            System.out.printf("%s -> %b\n", pwd[i], b);

        }

        boolean flag=false;
        while(flag){
            
        }
    }


    public static void main(String[] args) {
        RegExpTest t = new RegExpTest();
        t.exam();
    }
}
