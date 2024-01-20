import javax.swing.*;
import java.awt.*;
public class graphic2d extends JFrame {

    panelg2d panel;
    graphic2d(){

        panel=new panelg2d();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



}
