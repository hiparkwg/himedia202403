package lang;

import java.util.StringTokenizer;

public class TokenEx1 {
    public void test1(){
        String data = "100,200,300,400,500";
        StringTokenizer st = new StringTokenizer(data, ",");
        int sum=0;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            sum += Integer.parseInt(s);

            System.out.println(s);
        }
        System.out.printf("sum=%d\n", sum);
    }
    public void test2(){
        String data= "1.홍길동,90, 80,70 | 2.일지매,70,  80,90 |"
                  + "3.춘향이,50,60,70 | 4.향단이,70, 60,70";

        StringTokenizer st1 = new StringTokenizer(data, "|");
        while(st1.hasMoreTokens()){
            String str1 = st1.nextToken().trim();
            StringTokenizer st2 = new StringTokenizer(str1, ",");
            int sum=0;
            String name = st2.nextToken();
            while(st2.hasMoreTokens()){
                int n = Integer.parseInt( st2.nextToken().trim() );
                sum += n;
            }
            System.out.println("------------");
            System.out.println("name : " + name);
            System.out.println("sum : " + sum);

        }

    }

    // String.split() VS StringTokenizer
    public void test3(){
        String data="1,2,3,,,,abc...a.b.c,asd,ga,df,,,asdf";
        String[] r1 = data.split("\\.|,");
        for(int i=0; i<r1.length ; i++){
            System.out.printf("r1[%d]=%s\n", i, r1[i]);
        }
        System.out.println("--------------------");
        StringTokenizer st = new StringTokenizer(data, ",.");
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken() + ", ");
        }

    }


    public static void main(String[] args) {
        TokenEx1 e = new TokenEx1();
        //e.test1();
        //e.test2();
        e.test3();
    }
}
