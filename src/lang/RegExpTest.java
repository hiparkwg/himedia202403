package lang;

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
    public static void main(String[] args) {
        RegExpTest t = new RegExpTest();
        t.normal();
    }




    public void number(){

    }
    public void alpha(){

    }
    public void hangul(){

    }

    public void phone(){

    }
    public void email(){

    }


}
