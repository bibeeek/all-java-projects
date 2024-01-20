import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


//this class holds images
public class DRAG2 extends JPanel {

    ImageIcon image=new ImageIcon("rocket.png");
    final int WIDTH=image.getIconWidth();
    final int HEIGHT=image.getIconHeight();
    Point imageCorner;
    Point prevpt;  //previous point

    DRAG2(){
        imageCorner=new Point(0,0);
        ClickListener clickListener=new ClickListener();
        DragListener dragListener=new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g){  //repaint our image after  repositioning

        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());



    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevpt=e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt=e.getPoint();

            imageCorner.translate(
                    (int)(currentPt.getX()-prevpt.getX()),
                    (int)(currentPt.getY()-prevpt.getY())
            );
            prevpt=currentPt;
            repaint();
        }
    }

}
