/*
 * 제품고유번호를 사용한 삭제
 */
package product;
import java.util.*;
public class ProductDelete {
    public void delete(){
        Scanner s = new Scanner(System.in);
        int no=-1;
        int pos=-1;
        String yn="";

        System.out.print("삭제할 제품의 고유번호 >>> ");
        no = s.nextInt();
        s.nextLine();//enter key 버림
        for(int i=0; i<ProductMain.cnt; i++){
            ProductVo vo = ProductMain.products[i];
            if(vo.getNo()==no){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            System.out.println("삭제할 데이터가 없습니다.");
            return;
        }
        ProductVo v = ProductMain.products[pos];
        System.out.println("고유번호 : " + v.getNo());
        System.out.println("제품코드 : " + v.getCode());
        String codeName = ProductSearch.findCodeName(v.getCode());
        System.out.println("제품명 : " + codeName);
        System.out.println("수량 : " + v.getEa());
        System.out.println("단가 : " + v.getPrice());
        System.out.println("금액 : " + v.getAmt());

        System.out.print("삭제하시겠습니까(y/n) ? ");
        yn = s.nextLine();
        if(yn.toUpperCase().equals("Y")){
            //삭제된 위치에 다음 위치에 있는 데이터 이동(update)
            for(int i=pos; i<ProductMain.cnt-1; i++){
                ProductMain.products[i]=
                    ProductMain.products[i+1];

            }
            // 마지막 데이터 제거
            ProductMain.products[ProductMain.cnt-1] = null;
            ProductMain.cnt--;
            System.out.println("데이터가 삭제되었습니다.");
        }else{
            System.out.println("삭제가 취소 되었습니다.");
        }






    }
}
