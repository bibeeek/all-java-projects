import javax.swing.*;

public class JOPTIONPANE {

    public static void main(String[] args) {

        //joptionpane= pop up a standard dialog box that prompts users for a value or informs them of something

        //JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"!!YOUR COMPUTER HAS A VIRUS","title",JOptionPane.WARNING_MESSAGE);

       // JOptionPane.showConfirmDialog(null,"bro do you even code","wtf",JOptionPane.YES_NO_CANCEL_OPTION);


       //System.out.println( JOptionPane.showConfirmDialog(null,"bro do you even code","wtf",JOptionPane.YES_NO_CANCEL_OPTION));

      //  int answer=JOptionPane.showConfirmDialog(null,"bro do you even code","wtf",JOptionPane.YES_NO_CANCEL_OPTION);
        // answer ko int value usegarera we can use it in if else statement haru

        //String name= JOptionPane.showInputDialog("what is your name?:  ");
       // System.out.println("hell0"+name);

        String[] responses={"no you are awesome","thankyou","*blush*"};

        ImageIcon icon=new ImageIcon("image2.png");
        JOptionPane.showOptionDialog(null,
                "you are AWESOME",
                "message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);  //initial value=if want first button selected put 0 if 2md 1 ...

    }
}
