import javax.swing.*;

public class DRAG1 extends JFrame {


    DRAG2 dragPanel=new DRAG2();

    DRAG1(){

        this.add(dragPanel);
        this.setTitle("Drag and drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
