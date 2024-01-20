import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radioframetest extends JFrame implements ActionListener {

    //we can also create image icon by using ImageIcon pizzabtn; and instantiating in the constructor
    //and do pizzabtn.setIcon(pizzaicon)



    JRadioButton pizzabtn;
    JRadioButton burgerbtn;
    JRadioButton momo;
    radioframetest(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

         pizzabtn= new JRadioButton("pizza");
         burgerbtn=new JRadioButton("burger");
         momo=new JRadioButton("momo");

        ButtonGroup group=new ButtonGroup();  //to select only one item
        group.add(pizzabtn);
        group.add(burgerbtn);
        group.add(momo);

        pizzabtn.addActionListener(this);
        momo.addActionListener(this);
        burgerbtn.addActionListener(this);

        this.add(pizzabtn);
        this.add(momo);
        this.add(burgerbtn);

        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==pizzabtn){
            System.out.println("You Ordered Pizza");
        }
        else if(e.getSource()==burgerbtn){
            System.out.println("You ordered Burger");
        }
        else{
            System.out.println("You ordered Momo");
        }

    }
}
