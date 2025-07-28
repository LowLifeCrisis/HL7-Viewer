package hl7.gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class frame extends JFrame{

    public frame(){
        this.setTitle("HL7 Parser");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 800);



        var iconURL = getClass().getResource("/hl7/images/important.jpg");
        var image = new ImageIcon(iconURL);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.DARK_GRAY);


        this.setVisible(true);

    }
}
