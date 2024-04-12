package product;

public class ProductVo {
    private int no;
    private String code;
    private long ea;
    private long price;
    private long amt;

    ProductVo(){};
    ProductVo(int no, String code, long ea, long price){
        this.no = no;
        this.code = code;
        this.ea = ea;
        this.price = price;
        this.amt = ea*price;
    }

    //setter
    public void setNo(int no)    { this.no = no; }
    public void setCode(String c){ this.code = c; }
    public void setEa(long ea)   { this.ea = ea;}
    public void setPrice(long p) { this.price = p ; }
    public void setAmt(long amt) { this.amt = amt; }

    //getter
    public int getNo()     { return this.no ; }
    public String getCode(){ return this.code; }
    public long getEa()    { return this.ea; }
    public long getPrice() { return this.price; }
    public long getAmt()   { return this.amt;}

    public void compute(){
        this.amt = this.ea*this.price; 
    }
    public String print(){
        // 제품코드를 사용하여 제품명을 찾아 출력
        String codeName = ProductSearch.findCodeName(this.code);
        //String codeName = "냉장고";
        String temp = String.format(
                "%6d  %-10s%-20s%10d%10d%12d",
                no, code, codeName, ea, price, amt);
        return temp;                
    }
    public static void main(String[] args) {
        ProductVo vo = new ProductVo(100, "b", 10,5000);
        System.out.println(vo.print());
        vo.setCode("d");
        vo.setEa(20);
        vo.setPrice(4000);
        vo.compute();
        System.out.println(vo.print());
    }
}
