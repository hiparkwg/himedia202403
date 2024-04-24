/*
 * property를 파일에 저장하고 읽어오는 예
 */
package collect;
import java.io.*;
import java.util.*;
public class PropertiesEx2 {
    File file = new File("my.property");

    public void store() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("color",   "#000");
        prop.setProperty("size",    "12pt");
        prop.setProperty("bgColor", "#fff");
        prop.setProperty("border",  "2px");

        //해당 파일이 없으면 파일 생성
        if( !file.exists() ){
            file.createNewFile();
        }
        // properties 저장
        FileWriter fw = new FileWriter(file);
        prop.store(fw, "");
        fw.close();

    }

    public void load() throws IOException{
        FileReader fr = new FileReader(file);
        Properties readProp = new Properties();
        readProp.load(fr);

        // 모든 property를 출력
        Enumeration e = readProp.propertyNames();
        System.out.println("Enumeration으로 출력");
        while(e.hasMoreElements()){
            String key = (String)e.nextElement();
            String value = (String)readProp.getProperty(key);
            System.out.printf("%s=%s\n", key, value);
        }
        System.out.println("------------");
        readProp.list(System.out); // dummy 출력
    }

    public static void main(String[] args){
        PropertiesEx2 ex = new PropertiesEx2();
        try {
            ex.store();
            ex.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
