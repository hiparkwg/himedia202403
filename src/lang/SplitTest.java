package lang;

public class SplitTest {
    static void verSyac(String dataStr) {
        String[] dataList = dataStr.split("/");
        System.out.println("   이름   국어   영어   수학   총점   평균");
        for (String data : dataList) {
            String[] orgData = data.split(",");
            String name = orgData[0];
            int kor =  Integer.parseInt(orgData[1]);
            int eng =  Integer.parseInt(orgData[2]);
            int math =  Integer.parseInt(orgData[3]);
            int tot = kor + eng + math;
            double avg = tot / 3.0;
            System.out.printf("%5s %5s %6s %6s %6s %6s\n", 
                        name, kor, eng, math, tot, avg);
        }
    } 
    public void split(){
        String data="강아지,망아지,송아지,고양이";
        String[] r = data.split(",",3);
        for(int i=0; i<r.length ; i++){
            System.out.printf("data[%s]=%s\n", i, r[i]);
        }
    }

    public void multi(){
        String data = "강아지,망아지/송아지-고양이,/-홍길동";
        String[] r = data.split(",|/|-");// , or / or -
        for(int i=0; i<r.length ; i++){
            System.out.printf("data[%s]=%s\n", i, r[i]);
        }
    }
    public void alpha(){
        String data="강아지a망아지z송아지b고양이d홍길동k";
        String[] r = data.split("[a-z]");//a~z까지중 한문자
        System.out.println("alpha...................");
        for(int i=0; i<r.length ; i++){
            System.out.printf("data[%s]=%s\n", i, r[i]);
        }
    }
 
    public void splitType2(){//응용(배열 1개 사용)
        String data = "홍길동,90,90,93/"
                    + "일지매,80,80,85/" 
                    + "춘향이,70,70,77";
        String[] r = data.split(",|/");
        System.out.println("split type2........");
        for(int i=0 ; i<r.length ; i=i+4){
            String name = r[i+0];
            int kor = Integer.parseInt(r[i+1]);
            int eng = Integer.parseInt(r[i+2]);
            int mat = Integer.parseInt(r[i+3]);
            int tot = kor+eng+mat;
            double avg = tot/3.0;
            System.out.printf("%5s %5s %6s %6s %6s %6.1f\n", 
                        name, kor, eng, mat, tot, avg);
        }
    }

    public static void main(String[] args) {
        String data = "홍길동,90,90,90/일지매,80,80,80/춘향이,70,70,70";
        verSyac(data);
        SplitTest st = new SplitTest();
        st.split();
        st.multi();
        st.alpha();
        st.splitType2();
    }

}
