package hl7.gui;

import javax.swing.*;

public class frame {

    public frame(){
        var frame = new JFrame("HL7 Parser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);


        frame.add(label);
        frame.setVisible(true);

    }
}
