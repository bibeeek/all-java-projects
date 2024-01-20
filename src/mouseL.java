import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseL extends JFrame implements MouseListener {

    JLabel label;

    //can create image icon aswell
    //set lYout to flow and pack() it


    mouseL(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setLocationRelativeTo(null); //sets frame to appear in middle of screen


        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        label.addMouseListener(this);
        //this.addMouseListener(this); for entire frame

        this.add(label);
        this.setVisible(true);

        //set a default icon first ig


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //invoked when the mouse button is clicked(pressed or released) on a component
      //  System.out.println("You Clicked The Mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //invoked when a mouse button has been pressed on a component
        //System.out.println("You Pressed the Mouse");
        label.setBackground(Color.BLUE);

       // label.setIcon(....)

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //invoked when a mouse button hasbeen released on a component
        System.out.println("You Released the Mouse");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
   //invoked when themouse enters a component
   System.out.println("You Entered the component");
        label.setBackground(Color.cyan);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //invoked when the mouse exits a component
        System.out.println("You Exited the component");
        label.setBackground(Color.red);

    }
}
