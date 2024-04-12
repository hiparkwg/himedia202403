package product;

import java.util.Scanner;

public class ProductMain {
    public static int cnt = 0;
    public static ProductVo[] products = 
            new ProductVo[10];

    //일종의 database
    public static String[][] data = {
        {"a", "냉장고"},
        {"b", "세탁기"},
        {"c", "컴퓨터"},
        {"d", "자동차"}
    };
    public ProductMain(){
        // sample data 
        ProductMain.products[0] = new ProductVo(1, "a", 10,2000);
        ProductMain.products[1] = new ProductVo(2, "b", 500,500);
        ProductMain.products[2] = new ProductVo(3, "b", 500,500);
        ProductMain.products[3] = new ProductVo(4, "c", 500,500);
        ProductMain.products[4] = new ProductVo(5, "d", 500,500);
        ProductMain.cnt=5;

        Scanner s = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("제품 관리 프로그램 Ver 0.1");
            System.out.println("1=입력, 2=수정, 3=조회, 4=삭제, 0=종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            String menu = s.nextLine();
            switch(menu){
                case "0" : flag=false;break;
                case "1" : new ProductInput(); break;
                case "2" : new ProductModify(); break;
                case "3" : new ProductSearch(); break;
                case "4" : new ProductDelete(); break;
            }
        }
    }        
    public static void main(String[] args) {
        new ProductMain();
    }
}
