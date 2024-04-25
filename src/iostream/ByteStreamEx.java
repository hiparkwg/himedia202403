package iostream;
import java.io.*;
public class ByteStreamEx {
    String fileName = "test.txt";

    public void output() throws Exception{
        File file = new File(fileName);
        String data = "사자도 가젤도 죽을 힘을 다해 달리지 않으면 안된다.";
        byte[] bytes = data.getBytes("utf-8");
        OutputStream os = new FileOutputStream(file);
        os.write(bytes);
        System.out.println("file length : " + file.length());
        os.close();

    }
    /*
     * 1) 한글깨짐에 대한 보완책이 있어야 함.
     * 2) 마지막 바이트에 포함된 쓰레기값 제거.
     */
    public void input() throws Exception{
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        int readSize=0; // 파일을 읽은 크기
        byte[] bytes = new byte[10];//테스트용으로 아주 작게
        InputStream is = new FileInputStream(file);
        while( (readSize = is.read(bytes)) != -1 ){
            String temp = new String(bytes, 0, readSize, "utf-8");
            
            sb.append(temp);
            System.out.println("readSize : " + readSize);
            System.out.println(temp + "\n");
        }

        System.out.println(sb.toString());
        is.close();



    }
    public static void main(String[] args) {
        ByteStreamEx ex = new ByteStreamEx();
        try{
            ex.output();
            ex.input();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
