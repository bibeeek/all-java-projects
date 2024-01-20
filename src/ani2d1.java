import javax.swing.*;
import java.util.jar.JarFile;

public class ani2d1 extends JFrame {

    ani2d2 panel;

    ani2d1(){

        panel=new ani2d2();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
}
