import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorchooser extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    colorchooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Pick a Color");
        button.addActionListener(this);

        label=new JLabel();
        label.setBackground(Color.white);
        label.setText("hi its me again");
        label.setFont(new Font("MV Boli",Font.BOLD,100));
        label.setOpaque(true); //to display the background color we need this method

        this.add(button);
        this.add(label);


        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser=new JColorChooser();

            Color color=JColorChooser.showDialog(null,"PICK A COLOR",Color.cyan);
          //  label.setForeground(color);

            label.setBackground(color);
        }
    }
}
