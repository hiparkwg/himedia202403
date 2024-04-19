package date_calendar;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
    public void decimal(){//천단위
        double amt=1234567.123;
        DecimalFormat df = new DecimalFormat("#,###.##");
        System.out.println(df.format(amt));//1,234,567.12

        df = new DecimalFormat("\u00a4 #,###.##");
        System.out.println(df.format(amt));

        df = new DecimalFormat("00,000,000.000");
        System.out.println(df.format(123.1));
    }
    public void dateFormat(){
        SimpleDateFormat sdf = 
                new SimpleDateFormat("yyyy-MM-dd[E] HH:mm:ss");
        System.out.println(sdf.format(new Date()));                
    }
    public void choice(){
        //경계값
        double[] limt={0, 60, 70, 80, 90};//오름차정려(필수)
        String[] grade={"F","D","C", "B", "A"};
        int[] score={88,77,66,55,99,80,70,90};
        ChoiceFormat cf = new ChoiceFormat(limt, grade);
        for(int s : score){
            String g = cf.format(s);
            System.out.printf("%d => %s\n", s, g);
        }
    }

    public void message(){
        //String str = String.format("패턴", 값)
        //System.out.printf("패턴", 값)
        String msg = "당신의 이름은 {0} 이고, 주소는 {1}, 성적은 {2} 입니다."
                   + " 따라서 {0}은 {3} 입니다.";
        String[] data = {"홍길동", "남원", "60", "합격"};
        String dm = MessageFormat.format(msg, data);
        System.out.println(dm);
    }
    public static void main(String[] args) {
        FormatTest ft = new FormatTest();
        //ft.decimal();
        //ft.dateFormat();
        //ft.choice();
        ft.message();
    }
}
