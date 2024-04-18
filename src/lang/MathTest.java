package lang;

public class MathTest {
    public void ceil(){
        double n1 = 2.5;
        double n2 = -2.5;
        System.out.printf("Math.ceil(2.5)= %s, Math.ceil(-2.5)=%s\n",
                Math.ceil(n1), Math.ceil(n2)
        );
    }
    public void floor(){
        double n1=2.5;
        double n2=-2.5;
        System.out.printf("Math.floor(2.5)= %s, Math.floor(-2.5)=%s\n",
                Math.floor(n1), Math.floor(n2)
        );

    }

    public void round(){
        double d1 = 123456.789;
        double d2 = 123.456;
        System.out.printf("Math.round(d1)=%d\n", Math.round(d1));//123457
        System.out.printf("Math.round(d2)=%d\n", Math.round(d2));//123

        // 123456.789 => 123460(6.789를 반올림)
        System.out.printf("Math.round(d)=%d", Math.round(d1/10)*10);

        // 123456.789 => 123456.8
        System.out.printf("Math.round(d)=%.1f", Math.round(d1*10)/10.0);
        
     }
    public static void main(String[] args) {
        MathTest mt = new MathTest();
        mt.ceil();
        mt.floor();
        mt.round();
    }
}
