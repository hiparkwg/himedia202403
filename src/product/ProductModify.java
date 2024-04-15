package product;
import java.util.*;
public class ProductModify {
    public void modify(){
        Scanner s = new Scanner(System.in);
        int no=-1; //수정할 데이터의 고유번호
        int pos=-1; //수정할 데이터의 위치
        String code="";
        String codeName="";
        int ea=0;
        int price=0;
        String yn=""; //수정 여부

        System.out.print("수정할 데이터의 고유번호 : ");
        no = s.nextInt();
        s.nextLine();

        // 입력된 고유번호(no)을 사용하여 실제 위치
        for(int i=0; i<ProductMain.cnt; i++){
            ProductVo v = ProductMain.products[i];
            if(no== v.getNo()){
                pos = i;
                break;
            }
        }
        // 못찾은경우
        if(pos==-1) return;

        ProductVo vo = ProductMain.products[pos];

        System.out.printf("제품코드 : [%s] >>> ", vo.getCode() );
        code = s.nextLine();
        
        codeName = ProductSearch.
            findCodeName(code.equals("")? vo.getCode():code);
        System.out.println("제품명 : " + codeName);

        System.out.printf("수량 : [%s] >>>", vo.getEa() );
        ea = s.nextInt();
        s.nextLine();

        System.out.printf("단가 : [%s] >>> ", vo.getPrice());
        price = s.nextInt();
        s.nextLine();

        System.out.println("금액 : " + (ea*price));

        System.out.print(" 위 내용으로 수정(y/n) ?");
        yn = s.nextLine();
        if( yn.toUpperCase().equals("Y") ){
            vo.setCode(code.equals("")? vo.getCode(): code);
            vo.setEa(ea==0? vo.getEa() : ea);
            vo.setPrice(price==0? vo.getPrice() : price);
            vo.compute();
            System.out.println("자료가 수정됨.");
        }else{
            System.out.println("자료 수정이 취소됨.");
        }
    }
}
