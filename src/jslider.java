import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class jslider extends JFrame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;

    JSlider Slider;

    jslider(){

        frame=new JFrame("SLIDER DEMO");
        panel=new JPanel();
        label=new JLabel();
        Slider=new JSlider(0,100,50);

        Slider.setPreferredSize(new Dimension(400,200));

        Slider.setPaintTicks(true);
        Slider.setMinorTickSpacing(10);

        Slider.setPaintTrack(true);
        Slider.setMajorTickSpacing(25);

        Slider.setPaintLabels(true); //numbering garna lai
        Slider.setFont(new Font("MV Boli",Font.BOLD,15));

        Slider.setOrientation(SwingConstants.VERTICAL);


        label.setFont(new Font("MV Boli",Font.BOLD,25));

        Slider.addChangeListener(this);

        label.setText("°C= "+Slider.getValue());  //ya rakhe just 50 matra dekhairakhxa change garda ni


        panel.add(Slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);


    }

    public void stateChanged(ChangeEvent e){
        label.setText("°C= "+Slider.getValue());
    }
}

