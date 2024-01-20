import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myframm extends JFrame implements ActionListener {

    JButton button;
    JCheckBox box;
    ImageIcon xicon;
    ImageIcon checkicon;

        myframm(){

            xicon= new ImageIcon("cross1.png");
            checkicon=new ImageIcon("tick1.png");

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            this.setSize(500,500);


            button=new JButton("Submit");
            button.addActionListener(this);

            box=new JCheckBox();
            box.setText("Not a robot");
            box.setFocusable(false);
            box.setFont(new Font("Consolas",Font.PLAIN,35));
            box.setSelectedIcon(checkicon);  //switches between choices image
            box.setIcon(xicon);   //circles will be replaced by images

            this.add(button);
            this.add(box);
            this.pack();
            this.setVisible(true);




        }



    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){

           System.out.println(box.isSelected());   //returns true or false

        }


    }

}

