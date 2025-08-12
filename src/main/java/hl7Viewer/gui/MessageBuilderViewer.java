package hl7Viewer.gui;

import javax.swing.*;
import java.awt.*;

public class MessageBuilderViewer {

    private JTextArea _outputArea;
    //main panel creation
    public JPanel createMessageBuilderPanel() {
        var mainPanel = new JPanel(new BorderLayout());
        // Title at the top
        Utilities.setTitle(mainPanel, "HL7 Message Builder");
        // Split panel with two columns
        var splitPanel = new JPanel(new GridLayout(1, 2));
        splitPanel.add(messageCustomizationPanel());
        splitPanel.add(generatedMessagePanel());

        mainPanel.add(splitPanel, BorderLayout.CENTER);
        return mainPanel;
    }
    //creates message picker panel
    private JPanel messageCustomizationPanel() {
        var customizationPanel = new JPanel();
        customizationPanel.setLayout(new BoxLayout(customizationPanel, BoxLayout.Y_AXIS));
        customizationPanel.setBorder(BorderFactory.createTitledBorder("Customization"));
        Utilities.applyTitledBorder(customizationPanel, "Hl7 Message Picker");
        return customizationPanel;
    }
    //creates panel that will show generated message
    private JPanel generatedMessagePanel() {
        var messagePanel = new JPanel(new BorderLayout());
        Utilities.applyTitledBorder(messagePanel, "Message Output");

        _outputArea = new JTextArea();
        Utilities.setPanelColors(_outputArea);
        _outputArea.setEditable(false);
        _outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

       Utilities.setScrollPane(_outputArea, messagePanel);

        return messagePanel;
    }
    //will be used to set the output message
    public void setOutputMessage(String message) {
        _outputArea.setText(message);
    }
}
