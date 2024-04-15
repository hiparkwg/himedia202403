/*
 * extends, implements 모두 사용
 */
package inheri;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame
                     implements ActionListener{
    public MyFrame(){
        this.setBounds(300,300,400,250);//(x,y,width, height)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("나의 첫번째 GUI");
        this.setLayout(null);//버튼의 위치를 내마음대로 하기 위해

        //button 추가
        JButton btn = new JButton("확인");
        btn.setBounds(100,100,100,30);
        btn.addActionListener(this);
        this.add(btn);
    }
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hi...");
    }

}
