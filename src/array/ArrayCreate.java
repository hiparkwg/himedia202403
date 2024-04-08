package array;

import java.util.Arrays;

public class ArrayCreate{
    ArrayCreate(){
        System.out.println("배열 생성");
        int[] kor   = new int[5];
        int   eng[] = new int[5];
        int[] mat; //배열 변수명만 선언

        //배열선언과 동시에 초기값 대입
        int[] score = new int[]{10,20,30,40,50};

        //배열명만 선언후 나중에 크기를 지정할 때
        mat = new int[5];

        //배열변수에 값 대입
        System.out.println("대입전 : " + kor[0]);
        kor[0] = 99;
        System.out.println("대입후 : " + kor[0]);

        // 배열 전체를 출력
        System.out.println("kor : " + 
            Arrays.toString(kor));

        // 모든 배열에 임의의값 저장
        kor[1] = 90;
        kor[2] = 80;
        kor[3] = 70;           
        kor[4] = 60;
        // kor[5] = 50; // 사용된 첨자가 배열의 크기를 벗어남
        System.out.println(Arrays.toString(kor));
        
        //배열 kor의 합계, 평균
        int tot = kor[0]+kor[1]+kor[2]+kor[3]+kor[4];
        double avg = tot/5.0;

        System.out.println("합계 : " + tot);
        System.out.println("평균 : " + avg);
        
        // 배열 eng에 값을 저장한 후 총점 구하기
        eng[0] = 10;
        eng[1] = 20;
        eng[2] = 30;
        eng[3] = 40;
        eng[4] = 50;
        eng = new int[]{10,20,30,40,50};
        tot = 0;
        for(int i=0; i<eng.length ; i++){
            tot += eng[i];
        }
        System.out.println("eng 총점 : " + tot);
        








    }
    public static void main(String[] args){
        new ArrayCreate();
    }
}