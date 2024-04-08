package array;

public class ArrayEx7 {
    ArrayEx7(){
        String[] name={"홍","김","이","박"};
        double[][] score={
            {90,90,90,0,0},
            {80,80,80,0,0},
            {70,70,70,0,0},
            {60,60,60,0,0}
        };
        //총점과 평균
        for(int r=0 ; r<score.length; r++){
            score[r][3]=score[r][0] + score[r][1] + score[r][2];
            score[r][4]=score[r][3]/3.0;
        }

        //결과 출력
        System.out.println("성적 처리 현황");
        System.out.println("-".repeat(70));
        System.out.printf("%4s %10s %4s %4s %4s %4s %4s\n",
            "No", "성명","국어","영어","수학","총점","평균"
        );
        System.out.println("-".repeat(70));
        for(int r=0 ; r<score.length; r++){
            System.out.printf("%4s %10s %6s %6s %6s %7s %7.1f\n",
                (r+1), name[r], score[r][0], score[r][1],
                score[r][2], score[r][3], score[r][4]
            );

        }

    }
    public static void main(String[] args) {
        new ArrayEx7();
    }
}
