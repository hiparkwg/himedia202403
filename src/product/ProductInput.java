/*
 * 제품입력 클래스
 */
package product;
import java.util.*;

public class ProductInput {
    public ProductInput(){
        Scanner s = new Scanner(System.in);
        String code="";
        String codeName="";
        int ea=0;
        int price = 0;
        String yn=""; //저장 유무
        
        System.out.println("***제품입력***");
        System.out.print("제품코드 : ");
        code = s.nextLine();

        codeName = ProductSearch.findCodeName(code);
        System.out.println("제품명 : " + codeName);

        System.out.print("수량 : ");
        ea = s.nextInt();
        s.nextLine(); // 숫자입력후 엔터키 처리

        System.out.print("단가 : ");
        price = s.nextInt();
        s.nextLine(); 

        // 입력된 정보를 사용하여 vo 생성
        ProductVo vo = 
            new ProductVo(ProductMain.no, code, ea, price);

        System.out.println("금액 : " + vo.getAmt());

        System.out.print("위의 내용을 저장하시겠습니까(y/n)? " );
        yn=s.nextLine();
        if(yn.toUpperCase().equals("Y")){
            ProductMain.products[ProductMain.cnt]=vo;
            ProductMain.cnt++;
            ProductMain.no++;
        }else{
            System.out.println("저장이 취소됨.");
        }
        //저장 확인용
        for(int i=0 ; i<ProductMain.cnt ; i++){
            ProductVo v = ProductMain.products[i];
            System.out.println(v.print());
        }
    }
}
