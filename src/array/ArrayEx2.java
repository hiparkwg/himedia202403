package array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] kor = new int[10];
        int[] eng = new int[10];

        // for문을 사용한 순차적인 숫자를 대입
        for(int i=0; i<10 ; i++){
            kor[i] = i+1;
        }

        // Math.random()을 사용한 난수를 대입
        for(int i=0 ; i<10 ; i++){
            int r = (int)(Math.random()*10)+1;
            eng[i] = r ;
        }
        System.out.println(Arrays.toString(kor));
        System.out.println("--------");
        System.out.println(Arrays.toString(eng));
    }
}
