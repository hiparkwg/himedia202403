package lang;

public class SplitTest {
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
        String[] r = data.split("[a-z]");
        System.out.println("alpha...................");
        for(int i=0; i<r.length ; i++){
            System.out.printf("data[%s]=%s\n", i, r[i]);
        }


    }

    public static void main(String[] args) {
        SplitTest st = new SplitTest();
        st.split();
        st.multi();
        st.alpha();
    }

}
