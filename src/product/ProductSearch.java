package product;
import java.util.*;
public class ProductSearch {
    // 제품코드 또는 제품명의 일부분으로 검색
    public void search(){
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        String findStr="";
        while(flag){ //검색에 대한 반복
            System.out.print("검색어(exit=종료) >>> ");
            findStr = s.nextLine();
            if(findStr.equals("exit")){
                flag=false;
                continue;
            }

            System.out.println("-".repeat(40));
            System.out.println("No   code   codeName    ea  price   amount");
            System.out.println("-".repeat(40));

            for(int i=0 ; i<ProductMain.cnt ; i++){
                ProductVo vo = ProductMain.products[i];
                String codeName = findCodeName(vo.getCode());
                if(vo.getCode().contains(findStr) ||
                   codeName.contains(findStr) ){
                        System.out.println(vo.print());
                   }
            }
        }
    }


    //제품코드를 사용하여 제품명 검색
    public static String findCodeName(String code){
        String codeName="";

        for(int i=0; i<ProductMain.data.length; i++){
            if(code.equals(ProductMain.data[i][0])){
                codeName = ProductMain.data[i][1];
                break;
            }
        }

        return codeName;
    }
}
