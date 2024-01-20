import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combobox  extends JFrame implements ActionListener {

    JComboBox box;
    combobox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"Dog","Cat","Bird"};
        //Integer[] animals={"Dog","Cat","bird"};

         box= new JComboBox(animals); //you can pass array in the constructor
        box.setEditable(true);  //can type to select
        System.out.println(box.getItemCount());
        box.addItem("horse");
        box.insertItemAt("pig",0);
        box.setSelectedIndex(0);
        box.removeItem("Cat");
        box.removeItemAt(0);
        //box.removeAllItems();


        box.addActionListener(this);
        this.add(box);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==box){
           // System.out.println(box.getSelectedItem());
            System.out.println(box.getSelectedIndex());
        }
    }
}
