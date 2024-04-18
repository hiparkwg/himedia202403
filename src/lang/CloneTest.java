package lang;

class Point implements Cloneable{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        String temp = 
            String.format("x=%s , y=%s", x,y);
        return temp;            
    }
    
    @Override
    public Object clone(){
        Object obj=null;
        try{
            obj = super.clone();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return obj;
    }
}


public class CloneTest {
    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2 = (Point)p1.clone();

        System.out.println(p1);
        System.out.println(p2);
    }
}
