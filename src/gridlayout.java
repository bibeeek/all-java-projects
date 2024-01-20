import javax.swing.*;
import java.awt.*;

public class gridlayout {

    public static void main(String[] args) {

        //gridlayout= places component in a grid of cells
        // each component takes all the available space within its cell
        // and each cell is the same size

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,5,5));  //rows and columns require
                                                                        // h and v margins

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));  //afai naya column/row banaidinxa if added more



        frame.setVisible(true);


    }
}
