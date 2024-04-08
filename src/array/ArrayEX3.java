package array;

public class ArrayEX3 {

    ArrayEX3(int a, int b, int c, int d, int e){
        int tot=0;
        double avg = 0D;
   
        int[] data = {a,b,c,d,e};
        for(int i=0; i<data.length; i++){
            tot += data[i];
        }
        avg = tot/(double)data.length;

        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
        
    }
    public static void main(String[] args) {
        ArrayEX3 ex = new ArrayEX3(2,2,3,4,5);

    }
}
