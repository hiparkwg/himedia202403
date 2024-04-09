//한명의 회원정보만을 저장하는 객체
package member;

public class MemberVo {
    private String id;
    private String irum;
    private String address;
    private String phone;

    MemberVo(){}
    MemberVo(String id, String irum, String ad, String ph){
        this.id = id;
        this.irum = irum;
        this.address = ad;
        this.phone = ph;
    }



    //setter
    public void setId(String id){ this.id = id ; }
    public void setIrum(String irum){ this.irum = irum; }
    public void setAddress(String ad){ this.address = ad; }
    public void setPhone(String p){ this.phone = p ; }

    // getter
    public String getId(){ return this.id; }
    public String getIrum(){ return this.irum; }
    public String getAddress(){ return this.address; }
    public String getPhone(){ return this.phone; }
}
