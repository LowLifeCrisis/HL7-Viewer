package hl7.gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.net.URL;

public class frame {

    public frame(){
        var frame = new JFrame("HL7 Parser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700, 700);
        frame.setVisible(true);

        URL iconURL = getClass().getResource("/hl7/images/important.jpg");
        var image = new ImageIcon(iconURL);
        frame.setIconImage(image.getImage());
    }
}
