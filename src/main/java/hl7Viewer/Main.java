package hl7Viewer;

import hl7Viewer.gui.GuiBase;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        runSwingGuiOnEdt();
    }
    // Runs the GUI in Event Dispatch Thread (EDT)
    private static void runSwingGuiOnEdt() {
        SwingUtilities.invokeLater(() -> {
            var program = new GuiBase();
            program.setVisible(true);
        });
    }

}