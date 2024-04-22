package array;
import java.util.*;

public class BubbleSort {
    int[] data = {7,1,2,3,9,7,6,5,4,8};
    public void asc(){
        boolean flag=true;//교환됨.
        int last=data.length-1;//비교의 마지막 위치
        long start = System.nanoTime();
        while(flag){
            flag=false;//교환된 사실이 없어
            for(int i=0; i<last ; i++){
                if(data[i]>data[i+1]){
                    int temp = data[i+1];
                    data[i+1]=data[i];
                    data[i]=temp;
                    flag=true;//교환된 사실이 있으므로
                }
            }
            last--;
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(Arrays.toString(data));
    }
    public void desc(){
        boolean flag=true;//교환됨.
        int last=data.length-1;//비교의 마지막 위치
        long start = System.nanoTime();
        while(flag){
            flag=false;//교환된 사실이 없어
            for(int i=0; i<last ; i++){
                if(data[i]<data[i+1]){
                    int temp = data[i+1];
                    data[i+1]=data[i];
                    data[i]=temp;
                    flag=true;//교환된 사실이 있으므로
                }
            }
            last--;
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(Arrays.toString(data));

    }
    public static void main(String[] args) {
        BubbleSort s = new BubbleSort();
        s.asc();
        s.desc();
    }
}
