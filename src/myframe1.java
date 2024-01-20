import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myframe1 extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    myframe1(){

        ImageIcon img=new ImageIcon("middle1.jpg");
        label=new JLabel();
        label.setIcon(img);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        ImageIcon image=new ImageIcon("image3.png");
      button =new JButton();
      button.setText("BUTTON");
      button.setBounds(100,100,250,100);
        button.addActionListener(this);
     button.setText("button");
      button.setFocusable(false);
      button.setIcon(image);
      button.setHorizontalTextPosition(JButton.CENTER);
      button.setVerticalTextPosition(JButton.BOTTOM);
      button.setFont(new Font("Comic Sans",Font.BOLD,25));
      button.setIconTextGap(-10);
      button.setForeground(Color.black);
      button.setBackground(Color.lightGray);
      button.setBorder(BorderFactory.createEtchedBorder());







       // button.addActionListener(e -> System.out.println("poo")); //advanced method known as lambda experession
        //to substitute implements actionlisteer and the if statement down


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);



    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){

            //System.out.println("poo");2
            button.setEnabled(false); //once pressed and disabled
            label.setVisible(true);
        }

    }
}
