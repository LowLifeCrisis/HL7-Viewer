package hl7Viewer;

import hl7Viewer.gui.GuiBase;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        runSwingGuiOnEdt();
    }
    // Runs the GUI in Event Dispatch Thread (EDT)
    private static void runSwingGuiOnEdt() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                var GuiBase = new GuiBase();
                GuiBase.setVisible(true);
            }
        });
    }

}