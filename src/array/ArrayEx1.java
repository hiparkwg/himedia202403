package array;

public class ArrayEx1 {
    // 배열에서 최대값을 찾아내어 출력
    public void exam1(){
        int[] score ={100,20,30,400,50,60,70};
        int max = score[0];
        for(int i=1; i<score.length ; i++){
            if(score[i] > max) max=score[i];
        }

        System.out.println("최대값 : " + max);
    }
    // 최고점을 받은 학생의 이름을 찾아 출력
    public void exam2(){
        String[] names ={"홍씨","김씨","박씨", "최씨","남씨"};
        int[] score =   {   33,   44,   155,    66,   77};
        int index=0;//최고점수의 위치
        int maxScore = score[index];

        for(int i=1;i<score.length ; i++){
            if(score[i] > maxScore){
                index = i;
                maxScore = score[i];

            }
        }
        System.out.println("최고 득점자 : " + names[index]);        
        System.out.println("최고 점수 : " + score[index]);


    }
    public static void main(String[] args) {
        ArrayEx1 obj= new ArrayEx1();
        //obj.exam1();
        obj.exam2();
    }
}
