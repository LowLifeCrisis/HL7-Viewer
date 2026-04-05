package hl7Viewer;

import hl7Viewer.gui.MainForm;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        runSwingGuiOnEdt();
    }

//   Runs the GUI in Event Dispatch Thread (EDT)
    private static void runSwingGuiOnEdt() {
        final var program = new MainForm();
        SwingUtilities.invokeLater(
                () ->  program.setVisible(true)
        );
    }
}
