import javax.swing.*;
import java.awt.*;

public class myframe extends JFrame {
    myframe(){

        this.setTitle("jframe title goes here");  //sets ttitle of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //from being resized
        this.setVisible(true);  //makes frame visible
        this.setSize(200,200);  //sets the x dimension, and y dimension of frame
        ImageIcon image=new ImageIcon("LEGO_logo.svg.png");  //create an imGE ICON

        this.setIconImage(image.getImage()); //change icon of frame

        this.getContentPane().setBackground(new Color(53, 222, 183));
        //change color of background

    }
}
