/* protected VS default 접근 */
package oop;

public class AccessTest 
       extends inheri.ProtectedTest{
    public AccessTest(){
        this.pwd="abcd";
        //default접근은 타 패키지에서 접근불가
        //this.id="park";
    }
}
