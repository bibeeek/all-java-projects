import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class panels {

    public static void main(String[] args) {

        //JPanel= a gui component hat functions as a contaner to hold other components
        ImageIcon image= new ImageIcon("image2.png");
        Border border=BorderFactory.createLineBorder(Color.black,1);


        JLabel label=new JLabel();
        label.setText("hi");
        label.setIcon(image);
       // label.setVerticalAlignment(JLabel.BOTTOM);  //not used using null layout manager/
      //  label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);
        label.setBorder(border);


        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(null);

        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(null);





        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        greenpanel.add(label);
    }
}
