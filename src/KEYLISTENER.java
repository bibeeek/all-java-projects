import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class KEYLISTENER  extends JFrame implements KeyListener {

    JLabel label;
    BufferedImage icon;

    KEYLISTENER() {
     //   icon=new BufferedImage(200,400,"r")

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        try {

            icon = ImageIO.read(getClass().getResourceAsStream("/imagee/rocket.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //label =new JLabel();

        ImageIcon img=new ImageIcon(icon);

        label = new JLabel();

        label.setBounds(0,0,100,100);
       // label.setBackground(Color.red);
         //label.setOpaque(true);
         label.setIcon(img);

        this.getContentPane().setBackground(Color.blue);  //to change color of frame
        this.add(label);
        this.setVisible(true);

    }
    @Override
    public void keyTyped(KeyEvent e) {
//invoked when a key is typed.uses keychar,char output
        switch (e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-10,label.getY());
                break;

            case 'w':label.setLocation(label.getX(), label.getY()-10);
                break;

            case 's':label.setLocation(label.getX(),label.getY()+10);
                break;

            case 'd':label.setLocation(label.getX()+10,label.getY());
                break;

        }





    }

    @Override
    public void keyPressed(KeyEvent e) {
//invoked when a physical key is pressed down.  uses keycode, int output

        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;

            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;

            case 40:
                label.setLocation(label.getX(), label.getY() +10);
                break;
        }

        System.out.println("You released key char: " +e.getKeyChar());
        System.out.println("You released key code: " +e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
//called whenever a button is released
    }





    public static void main(String[] args) {
        new KEYLISTENER();
    }
}
