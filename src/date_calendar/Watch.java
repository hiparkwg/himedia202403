package date_calendar;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Watch extends JFrame implements Runnable{
    JLabel label;

    public Watch(){
        this.setBounds(300,300,450,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("hi....");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("고딕체", Font.PLAIN, 32));
        this.add(label);

        this.setVisible(true);
    }
    

    public static void main(String[] args) {
        Watch w = new Watch();
        new Thread(w).start();
    }


    @Override
    public void run() {
        SimpleDateFormat sdf = 
            new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
        while(true){
            String now = sdf.format(new Date());
            label.setText(now);
            try{
                Thread.sleep(1000);
            }catch(Exception ex){}
        }            
    }
}
