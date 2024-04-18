package lang;

public class StringBuilderTest {
    public void builderTest(){
        String v1="홍길동";
        String v2="일지매";
        String r1 = v1+v2;
        
        StringBuilder sb = new StringBuilder();
        sb.append(v1);
        sb.append(v2);
        String r3 = sb.toString();

    }

    public static void main(String[] args) {
        StringBuilderTest test = new StringBuilderTest();
        test.builderTest();
    }
}
