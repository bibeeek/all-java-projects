import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    Menubar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar=new JMenuBar();

         fileMenu=new JMenu("File");
         editMenu=new JMenu("Edit"); //mathi auni bhag haru
         helpMenu=new JMenu("Help");


         loadItem=new JMenuItem("Load");   //mathiko menu ma kk rakhne bhanera
         saveItem=new JMenuItem("Save");
         exitItem=new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);  //L for load  alt+f for file
        editMenu.setMnemonic(KeyEvent.VK_E);  //s for save
        helpMenu.setMnemonic(KeyEvent.VK_H);   //e for exit

        loadItem.setMnemonic(KeyEvent.VK_L);  //L for load
        saveItem.setMnemonic(KeyEvent.VK_S);  //s for save
        exitItem.setMnemonic(KeyEvent.VK_E);   //e for exit


        menuBar.add(fileMenu);  //menu bar ma rakhna ko lagi
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        fileMenu.add(loadItem);     //filemenu bhitra rakhna ko lagi
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);
        this.setVisible(true);






    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource()==loadItem){

               System.out.println("**You Loaded The File**");
            }

             if(e.getSource()==saveItem){

              System.out.println("**You Saved The File**");
                 }

           if(e.getSource()==exitItem){

          System.exit(0);
     }

    }
}
