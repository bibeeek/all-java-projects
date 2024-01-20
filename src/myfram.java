import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myfram extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    myfram(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton("Submit");
        button.addActionListener(this);

        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.gray); //blinking line ho yo type garda aune

        textField.setText("username");

        // textField.setForeground(new Color(0x002343)); //different method of giving color


        this.add(button);
        this.add(textField);
        this.pack();   //size will adjust to fit component
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           button.setEnabled(false);
           System.out.println("welcome "+textField.getText());
           textField.setEditable(false);
       }
    }
}
