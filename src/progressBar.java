import javax.swing.*;
import java.awt.*;

public class progressBar extends JFrame {

    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar(0,100);

    progressBar(){

        bar.setValue(0);

        bar.setBounds(0,0,500,50);
        bar.setStringPainted(true); // adds a % to bar and if filled it changes
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(bar);
        fill(); //fill method call gareko eta
    }
        public void fill(){
        int counter=0;

        while(counter<=100){

            bar.setValue(counter);
            try {
                Thread.sleep(50);  //incresing over time , pause program for 1sec after each iteration
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter +=1;
            }
        bar.setString("Done! ");
        }

        }

