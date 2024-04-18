package lang;

import java.util.*;

/*
 * 배열의 깊은 복사 3가지 유형
 */
public class ArrayDeepCopy {
    public ArrayDeepCopy(){
        //1) for문을 사용한 복사
        int[] array1 = { 10, 20, 30 };
        //얇은 복사
        // int[] target1 = array1;

        int[] target1 = new int[array1.length];
        for(int i=0; i<array1.length ; i++){
            target1[i] = array1[i];
        }
        //깊은 복사 여부 테스트
        target1[0]=100;
        System.out.println("array1=" + Arrays.toString(array1));
        System.out.println("target1=" + Arrays.toString(target1));

        //2)System.arraycopy() 복사
        int[] array2 = {1,2,3,4,5};
        int[] target2 = new int[array2.length];
        System.arraycopy(array2, 0, target2, 0, array2.length);
        target2[0]=100;
        System.out.println("array2=" + Arrays.toString(array2));
        System.out.println("target2=" + Arrays.toString(target2));

        //3) clone()을 사용한 복사
        int[] array3 ={1,2,3,4,5};
        int[] target3 = array3.clone();
        target3[0]=100;
        System.out.println("array3=" + Arrays.toString(array3));
        System.out.println("target3=" + Arrays.toString(target3));

        // 얇은 복사
        int[] array4 = {1,2,3,4};
        int[] target4 = array4;
        target4[0]=100;
        System.out.println("array4=" + Arrays.toString(array4));
        System.out.println("target4=" + Arrays.toString(target4));

    }

    public static void main(String[] args) {
        new ArrayDeepCopy();
    }
}
