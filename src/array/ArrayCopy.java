package array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //1) 얇은 복사
        int[] kor = {10,20,30,40,50};
        int[] eng = kor;
        System.out.println(kor[0] + "," + eng[0]);
        kor[0] = 90;
        System.out.println(kor[0] + "," + eng[0]);

        //2) for문을 사용한 깊은 복사
        int[] mat = new int[kor.length*2];
        for(int i=0; i<5 ;i++){
            mat[i] = kor[i];
        }
        System.out.println("kor : " + Arrays.toString(kor));
        System.out.println("mat : " + Arrays.toString(mat));
        
        // 미션1)
        mat = new int[kor.length*2];
        for(int i=0; i<5 ;i++){
            mat[i+3] = kor[i];
        }
        System.out.println("kor : " + Arrays.toString(kor));
        System.out.println("mat : " + Arrays.toString(mat));

        // 미션2)
        mat = new int[kor.length*2];
        for(int i=1; i<=3 ;i++){
            mat[i+2] = kor[i];
        }
        System.out.println("kor : " + Arrays.toString(kor));
        System.out.println("mat : " + Arrays.toString(mat));

        //3) System.arraycopy()함수 사용한 깊은 복사
        mat = new int[kor.length*2];
        System.arraycopy(kor, 1, mat, 3, 3);
        System.out.println("mat : " + Arrays.toString(mat));

        //4) 깊은 복사된 배열의 값을 수정한 경우 원본 배열의 값이
        //   변경되는지 테스트

        mat[3]=100;
        System.out.println("kor[3] : " + kor[3]);
        System.out.println("mat[3] : " + mat[3]);
    }
}
