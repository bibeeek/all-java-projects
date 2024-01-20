import javax.swing.*;
import java.awt.*;

public class flowlayout {

    public static void main(String[] args) {

        //flowlayout= places component in a row, sized at their preffered size.

        // if the horizontal space in the container is too small,
        // the flowlayout class uses the next available row


        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));  //center trailing and leading hunxa FlowLayout. ____ ma,horizontal spacing and vertical spacing

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());   //default mai flowlayout use garxa panel le





        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));




        frame.add(panel);

        frame.setVisible(true);
    }
}
