package iostream;

import java.io.Serializable;

public class Data implements Serializable{
    public static long serialVersionUID = 1L;
    private String id;
    private String mName;
    private String addr;
    private String phone;
    private int point;

    public Data(){}
    public Data(String id, String mName, String addr, String phone, int point){
        this.id = id;
        this.mName = mName;
        this.addr = addr;
        this.phone = phone;
        this.point = point;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n-----------------");
        sb.append("\nid      : " + this.id);
        sb.append("\nname    : " + this.mName);
        sb.append("\naddress : " + this.addr);
        sb.append("\nphone   : " + this.phone);
        sb.append("\npoint   : " + this.point);
        return sb.toString();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }

    

}
