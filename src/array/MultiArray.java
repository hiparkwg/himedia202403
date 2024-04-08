package array;

import java.util.*;

public class MultiArray {
    public static void main(String[] args) {
        //1)선언 방법
        int[][] data = new int[5][4]; //5행4열
        int[][][] temp = new int[3][4][5]; // 3면4행5열

        int[][] score = {
            {  1, 2, 3, 4, 5 },
            { 10,20,30,40,50 }
        };

        for(int i=0; i<score.length ; i++ ){
            System.out.println(Arrays.toString(score[i]));
        }
        // 2중 for문을 사용하여 배열값을 하나씩 출력
        for(int r=0 ; r<score.length ; r++){
            for(int c=0 ; c<score[r].length ; c++){
                System.out.printf("%5d", score[r][c]);
            }
        }

    }
}
