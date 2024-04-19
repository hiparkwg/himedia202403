package date_calendar;

import java.util.*;

public class DateTest {
    String[] week ={"일", "월", "화", "수", "목", "금", "토"};

   public void date(){
     Date d = new Date();
     System.out.printf("년 : %s\n", d.getYear()+1900);
     System.out.printf("월 : %s\n", d.getMonth()+1);
     System.out.printf("일 : %s\n", d.getDate());
     System.out.printf("욜 : %s\n", week[d.getDay()]);
     System.out.printf("시 : %s\n", d.getHours());
     System.out.printf("분 : %s\n", d.getMinutes());
     System.out.printf("초 : %s\n", d.getSeconds());
 

   }
   public void calendar(){
    System.out.println("--------------");
    Calendar c = Calendar.getInstance();
    System.out.printf("년 : %s\n", c.get(Calendar.YEAR));
    System.out.printf("월 : %s\n", c.get(Calendar.MONTH)+1);
    System.out.printf("일 : %s\n", c.get(Calendar.DATE));
    System.out.printf("욜 : %s\n", week[Calendar.WEEK_OF_MONTH+1]);
    System.out.printf("시 : %s\n", c.get(Calendar.HOUR));
    System.out.printf("분 : %s\n", c.get(Calendar.MINUTE));
    System.out.printf("초 : %s\n", c.get(Calendar.SECOND));
   }
   public static void main(String[] args) {
    DateTest dt = new DateTest();
    dt.date();
    dt.calendar();
   }
}
