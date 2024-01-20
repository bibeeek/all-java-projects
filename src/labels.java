import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.border.Border;

public class labels {
    public static void main(String[] args) {
        //JLabel=a gui display re for a string of text,image or both

        JLabel label=new JLabel(); //crreate a label
        ImageIcon image=new ImageIcon("image.png");
        Border border=BorderFactory.createLineBorder(Color.cyan,3);

        label.setText("Bro do you even Code!!!!"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  //set text left,center or right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);  //set text top,center or bottom of imageicon
        label.setForeground(Color.green);  //set font color of text
        label.setFont(new Font("MV Boli",Font.ITALIC,20)); //set font of text
        label.setIconTextGap(10);
        label.setBackground(Color.blue);
        label.setOpaque(true); //display background color
        label.setBorder(border); //sets border of label(not image+text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
       // label.setBounds(100,100,250,250); //sets x,y position within frameas well as dimension

        JFrame frame= new JFrame();
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack(); //resize the size of frame to accomodate the all the components ,written in end it adjust to accomodate


    }
}
