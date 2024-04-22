package collect;

import java.util.*;

public class ComparatorEx2 {
    public void asc(){
        List<CompareData> list = new ArrayList<CompareData>();
        list.add(new CompareData("c001","홍길동", 90));
        list.add(new CompareData("a001","일지매", 60));
        list.add(new CompareData("z001","향단이", 99));
        list.add(new CompareData("f001","임걱정", 77));
        list.add(new CompareData("k001","방자", 50));
        //원본 데이터
        for(CompareData d : list){
            System.out.println(d);
        }
        //정렬
        System.out.println("-------------------");
        Collections.sort(list, new CompareData());
        for(CompareData d : list){
            System.out.println(d);
        }
    }
    public static void main(String[] args) {
        new ComparatorEx2().asc();
    }
}
class CompareData implements Comparator{
    String id;
    String mName;
    int    score;
    public CompareData(){}
    public CompareData(String id, String name, int s){
        this.id = id;
        this.mName = name;
        this.score = s;
    }
    public String toString(){
        String temp = String.format("%s [ %s ] = %d",
                            this.id, this.mName, this.score  );
        return temp;                            
    }
    @Override
    public int compare(Object o1, Object o2) {
        //이름순으로 정렬
        //성적의 내림차순
        int r=-1;

        if(o1 instanceof CompareData & o2 instanceof CompareData){
            CompareData d1 = (CompareData)o1;
            CompareData d2 = (CompareData)o2;
            //r=d1.mName.compareTo(d2.mName);//이름순으로
            

        }
        return r;
    }


}
