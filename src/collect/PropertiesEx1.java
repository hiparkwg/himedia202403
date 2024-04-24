package collect;
import java.util.*;
public class PropertiesEx1 {
  public void test(){
    Properties prop = new Properties();
    // prop에 값 저장(key, value값 모두가 문자열)
    prop.setProperty("timeout", "30");
    prop.setProperty("language", "kr");
    prop.setProperty("size", "10");
    prop.setProperty("capacity", "10");

    // 모든 요소를 출력
    Enumeration e = prop.propertyNames();
    while(e.hasMoreElements()){
        String key = (String)e.nextElement();
        String value = prop.getProperty(key);
        System.out.printf("%s=%s\n", key, value);
    }
    //값 수정
    prop.setProperty("size", "20");
    System.out.printf("수정된값 : %s=%s\n", 
                        "size", prop.getProperty("size"));
    System.out.printf("%s=%s\n", 
                        "capacity", prop.getProperty("capacity", "20"));
    System.out.printf("%s=%s\n", 
                        "locafactor", prop.getProperty("loadfactor", "0.75"));

    System.out.println("------");
    prop.list(System.out);
  } 
  public static void main(String[] args) {
    new PropertiesEx1().test();
  } 
}
