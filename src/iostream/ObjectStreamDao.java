package iostream;
import java.util.*;
import java.io.*;

public class ObjectStreamDao {
    String fileName = "ObjectStreamDao.data";
    List<Data> list;
    Scanner s;
    public ObjectStreamDao(){
        list = new ArrayList<Data>();
        s = new Scanner(System.in);

        while(true){
            System.out.println("Object Data CRUD");
            System.out.print("1=입력 2=수정 3=조회 4=삭제 r=파일읽기 s=파일저장 0=종료 >>>");
            String menu = s.nextLine();
            if(menu.equals("0")) break;
            switch(menu){
                case "1" : insert();break;
                case "2" : update();break;
                case "3" : search();break;
                case "4" : delete();break;
                case "r" : read();break;
                case "s" : save();break;
            }
        }   
        s.close();         

    }
    public void insert(){
        String id="";
        String name="";
        String addr="";
        String phone = "";
        int    point=0;
        String yn="";

        System.out.println("데이터 입력");
        System.out.print("아이디 : ");
        id = s.nextLine();

        System.out.print("성명 : ");
        name = s.nextLine();

        System.out.print("주소 : ");
        addr = s.nextLine();

        System.out.print("연락처 : ");
        phone = s.nextLine();

        System.out.print("포인트 : ");
        point = s.nextInt();s.nextLine();

        System.out.print("저장 하시겠습니까(y/n) ? ");
        yn = s.nextLine();
        if(yn.equals("y")){
            Data d = new Data(id, name, addr, phone, point);
            list.add(d);
            System.out.printf("%s 번째 데이터가 입력되었습니다.\n", list.size());
        }
    }
    public void save(){
        File file = new File(fileName);
        String yn="";

        if(file.exists()){//파일이 존재하면
            System.out.print("이미 파일이 존재합니다. 그래도 저장(y/n) ? ");
            yn=s.nextLine();
            if( yn.equals("n")) return;
        }

        try{
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(list);
            oos.flush();
            System.out.println("파일이 저장되었습니다.");
            oos.close();
            os.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }    

    public void read(){
        List<Data> tempList = null;
        File file = new File(fileName);
        try{
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            tempList = (List<Data>)ois.readObject();
            
            System.out.printf("%s건의 데이터를 읽었습니다.\n", tempList.size());

            if(list.size()>0){
                System.out.println("이미 자료가 있습니다.");
                System.out.print("기존 자료에 추가하시겠습니까(y/n) ?");
                String yn = s.nextLine();
                if(yn.equals("n")){
                    list.clear();
                }
            }

            for(Data d : tempList){
                list.add(d);
            }

            ois.close();
            is.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void search(){
        String findStr="";
        System.out.print("검색어를 입력하세요 >>> ");
        findStr = s.nextLine();
        
        for(Data d : list){
            if(d.getId().equals(findStr)     || d.getmName().contains(findStr) ||
               d.getAddr().contains(findStr) || d.getPhone().contains(findStr)){
                System.out.println(d.toString());
            }
        }

    }
    public void update(){
        String findId="";
        String yn="";
        String name="";
        String addr="";
        String phone="";
        int    point=0;

        System.out.print("수정할 회원의 아이디 >>> ");
        findId = s.nextLine();
        for(Data d : list){
            if(d.getId().equals(findId)){
                System.out.printf("이름 : [%s] >>> ", d.getmName());
                name = s.nextLine();
                name = name.equals("")? d.getmName() : name;

                System.out.printf("주소 : [%s] >>> ", d.getAddr());
                addr = s.nextLine();
                addr = addr.equals("")? d.getAddr() : addr;

                System.out.printf("연락처 : [%s] >>> ", d.getPhone());
                phone = s.nextLine();
                phone = phone.equals("")? d.getPhone() : phone;

                System.out.printf("포인트 : [%s] >>> ", d.getPoint());
                point = s.nextInt(); s.nextLine();
                point = point==0? d.getPoint() : point;

                System.out.print("정말 수정하시겠습니까(y/n) ? ");
                yn = s.nextLine();
                if(yn.equals("y")){
                    d.setmName(name);
                    d.setAddr(addr);
                    d.setPhone(phone);
                    d.setPoint(point);
                    System.out.println("자료가 수정되었습니다.");
                    break;
                }else{
                    System.out.println("수정 작업이 취소되었습니다.");
                }
            }
        }

    }
    public void delete(){}


    public static void main(String[] args) {
        ObjectStreamDao dao = new ObjectStreamDao();
    }
}
