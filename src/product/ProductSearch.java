package product;

public class ProductSearch {
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
