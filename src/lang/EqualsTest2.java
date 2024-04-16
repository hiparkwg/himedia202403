/*
 * equals()사용하여 이름과 연락처가 같으면 같은 객체로 처리
 */
package lang;

class Member{
    String mName;
    String phone;
    public Member(String n, String p){
        this.mName = n;
        this.phone = p;
    }

    @Override
    public int hashCode(){
        return this.mName.hashCode() + this.phone.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        boolean b=false;
        Member m = null;
        if(obj instanceof Member){
            m = (Member)obj;
            if( mName.equals(m.mName) && phone.equals(m.phone)){
                b=true;
            }
        }
        return b;
    }
}

public class EqualsTest2 {
    public void test(){
        Member m1 = new Member("hong", "010-1111-1111");
        Member m2 = new Member("hong", "010-1111-1111");
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("equals...");
        if(m1.equals(m2)){
            System.out.println("같은 회원입니다.");
        }else{
            System.out.println("서로 다른 회원입니다.");
        }

        // == 비교해 보자
        System.out.println("==");
        if(m1==m2){
            System.out.println("같은 회원입니다.");
        }else{
            System.out.println("서로 다른 회원입니다.");
        }  
              
    }
    public static void main(String[] args) {
        new EqualsTest2().test();
    }
}
