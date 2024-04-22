/*배열의 값을 선택정렬함 */
package array;
import java.util.*;
public class SelectedSort {
    int[] data = {7,1,2,3,9,7,6,5,4,8};
    public void asc(){
        long start = System.nanoTime();
        for(int b=0; b<data.length-1; b++){//기준위치
            for(int t=b+1; t<data.length ; t++){//비교 대상위치
                if(data[b]>data[t]){
                    int temp = data[t];
                    data[t] = data[b];
                    data[b] = temp;
                }
            }
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(Arrays.toString(data));
    }
    public void desc(){
        for(int b=0; b<data.length-1; b++){//기준위치
            for(int t=b+1; t<data.length ; t++){//비교 대상위치
                if(data[b]<data[t]){
                    int temp = data[t];
                    data[t] = data[b];
                    data[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    
    }
    public static void main(String[] args) {
        SelectedSort s = new SelectedSort();
        s.asc();
        s.desc();
    }
}
