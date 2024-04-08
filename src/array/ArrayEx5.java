package array;

import java.util.Scanner;

public class ArrayEx5 {
    public ArrayEx5(){
        String[] names=  {"김","이","박","최","홍", "남"};
        String[] address={"서울", "부산", "대구","서울", 
                          "서울", "성남"};
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("검색할 주소는 ? ");
            String addr = s.nextLine();
            if(addr.equals("exit")) break;
            for(int i=0; i<address.length; i++){
                if(addr.equals(address[i])){ // addr==address[i]
                    System.out.println(names[i]);
                }
            }
            System.out.println("-".repeat(40));
        }                          
                          


    }
    public static void main(String[] args) {
        ArrayEx5 ex = new ArrayEx5();
    }
}



