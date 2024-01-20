import javax.swing.*;
import java.awt.*;

public class panelg2d extends JPanel {

    Image image;
    panelg2d(){
        image=new ImageIcon("img_1.png").getImage();
        this.setPreferredSize(new Dimension(500,500));

    }
    public void paint(Graphics g){

        Graphics2D g2D=(Graphics2D) g;
        g2D.drawImage(image,0,0,null);
        g2D.setPaint(Color.BLUE);
        //g2D.setStroke(new BasicStroke(5));
      //  g2D.drawLine(0,0,500,500);
                                    //overlappng willbe there if placed after new elemt...
       // g2D.drawRect(0,0,100,200);
        //g2D.fillRect(0,0,100,200);

        g2D.drawOval(0,0,100,100);
        g2D.setPaint(Color.red);
       g2D.drawArc(0,0,100,100,180,180);
        g2D.fillArc(0,0,100,100,0,180);

        g2D.setPaint(Color.white);
        g2D.fillArc(0,0,100,100,180,180);

        int[] xpoints={150,250,350};
        int[] ypoints={300,150,300};
        g2D.setPaint(Color.yellow);

        g2D.fillPolygon(xpoints,ypoints,3);  //neeed to pass array ofintegers

        g2D.setFont(new Font("Ink Free",Font.BOLD,50));

        g2D.drawString("you r a winner",50,50);



    }
}
