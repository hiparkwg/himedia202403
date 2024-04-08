package array;

public class ArrayEx6 {
    ArrayEx6(){
        int[] data = {8,2,3,14,5};
        int minPos=0; //최소값의 위치
        int maxPos=0; //최대값의 위치
        int meanPos=0;//중간값의 위치
        
        int tot=0;
        double avg=0d;
        double mean=99999d; //중간값

        //총점, 평균, 최대값, 최소값
        for(int i=0; i<data.length; i++){
            tot += data[i];
            //최대값인가?
            if(data[i]>data[maxPos]) maxPos=i;
            //최소값인가?
            if(data[i]<data[minPos]) minPos=i;
        }

        //평균, 중간값
        avg = tot/(double)data.length;
        for(int i=0 ; i<data.length ; i++){
            double temp = Math.abs(avg-data[i]);
            if(mean>temp){
                mean = temp;
                meanPos=i;
            }
        }

        System.out.println("최대값 : " + data[maxPos]);
        System.out.println("최소값 : " + data[minPos]);
        System.out.println("중간값 : " + data[meanPos]);
        
    }

    public static void main(String[] args) {
        new ArrayEx6();
    }
}
