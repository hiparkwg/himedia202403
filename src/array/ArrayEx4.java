package array;
import java.util.*;
public class ArrayEx4 {
    public static void main(String[] args) {
        new ArrayEx4();
    }

    ArrayEx4(){
        int[] data = {1,3,5,7,9,2,4,6,8,10,-2,-4,-7,-9};
        int[] odd = new int[data.length];
        int[] even = new int[data.length];

        int oddCnt=0;//홀수의 개수
        int evenCnt=0;//짝수의 개수

        for(int i=0; i<data.length ; i++){
            if(data[i]%2==0){
                even[evenCnt] = data[i];
                evenCnt++;
            }else{
                odd[oddCnt] = data[i];
                oddCnt++;
            }
        }

        System.out.println("짝수만 : " + Arrays.toString(even));
        System.out.println("홀수만 : " + Arrays.toString(odd) );

    }
}
