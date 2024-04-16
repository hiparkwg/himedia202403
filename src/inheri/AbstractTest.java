/* 
 * 추상 클래스 만들어 사용하기
 */
package inheri;

//추상 클래스
abstract class MemberAbstract{
    abstract void insert();
    abstract void modify();
    abstract void delete();
    void search(){
        System.out.println("멤버 목록 조회");
    };
}

// 추상 클래스를 상속받은 구현 클래스
class RegisterMember extends MemberAbstract{

    @Override
    void insert() {
        System.out.println("insert()");
    }

    @Override
    void modify() {
        System.out.println("modify()");
    }

    @Override
    void delete() {
        System.out.println("delete()");
    }
    
}

class GeustMember extends MemberAbstract{

    @Override
    void insert() {
    }

    @Override
    void modify() {
    }

    @Override
    void delete() {
    }
    
}

//프로그램 실행
public class AbstractTest {
    public static void main(String[] args) {
        // 다형성
        MemberAbstract register = new RegisterMember(); 
        MemberAbstract guest = new GeustMember();

        register.search();
        guest.search();

    }
}
