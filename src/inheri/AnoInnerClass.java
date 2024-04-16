/*
 * 이벤트 핸들링을 익명형 내부 클래스로 처리
 */
package inheri;
import javax.swing.*;
import java.awt.event.*;

public class AnoInnerClass extends JFrame{
    JButton btn = new JButton("OK");

    public AnoInnerClass(){
        this.setTitle("Ano inner class test");
        this.setBounds(300,300,250,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(btn);
        this.setVisible(true);

        //버튼의 이벤트 처리를 익명형으로 지정
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev){
                System.out.println("OK...");
            }
        });
    }
    public static void main(String[] args) {
        new AnoInnerClass();
    }
    
}
